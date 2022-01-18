
package net.mcreator.tntgoboom.world.features.ores;

public class PotehtohOreFeature extends OreFeature {

	public static final PotehtohOreFeature FEATURE = (PotehtohOreFeature) new PotehtohOreFeature().setRegistryName("tnt_go_boom:potehtoh_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(PotehtohOreFeatureRuleTest.INSTANCE, TntGoBoomModBlocks.POTEHTOH_ORE.defaultBlockState(), 7))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(1), VerticalAnchor.absolute(63)))).squared().count(11);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public PotehtohOreFeature() {
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

	private static class PotehtohOreFeatureRuleTest extends RuleTest {

		static final PotehtohOreFeatureRuleTest INSTANCE = new PotehtohOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<PotehtohOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<PotehtohOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("tnt_go_boom:potehtoh_ore_match"), () -> codec);

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
