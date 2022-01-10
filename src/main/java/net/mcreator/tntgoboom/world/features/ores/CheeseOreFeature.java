
package net.mcreator.tntgoboom.world.features.ores;

public class CheeseOreFeature extends OreFeature {

	public static final CheeseOreFeature FEATURE = (CheeseOreFeature) new CheeseOreFeature().setRegistryName("tnt_go_boom:cheese_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(CheeseOreFeatureRuleTest.INSTANCE, TntGoBoomModBlocks.CHEESE_ORE.defaultBlockState(), 0))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(1), VerticalAnchor.absolute(7)))).squared().count(1);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public CheeseOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class CheeseOreFeatureRuleTest extends RuleTest {

		static final CheeseOreFeatureRuleTest INSTANCE = new CheeseOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<CheeseOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<CheeseOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("tnt_go_boom:cheese_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
