
package net.mcreator.tntgoboom.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.tntgoboom.init.TntGoBoomModBlocks;

import java.util.Set;
import java.util.Random;

public class Bingqiling_stuffOreFeature extends OreFeature {
	public static final Bingqiling_stuffOreFeature FEATURE = (Bingqiling_stuffOreFeature) new Bingqiling_stuffOreFeature()
			.setRegistryName("tnt_go_boom:bingqiling_stuff_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(Bingqiling_stuffOreFeatureRuleTest.INSTANCE, TntGoBoomModBlocks.BINGQILING_STUFF_ORE.defaultBlockState(),
					22))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(1), VerticalAnchor.absolute(256)))).squared().count(19);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public Bingqiling_stuffOreFeature() {
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

	private static class Bingqiling_stuffOreFeatureRuleTest extends RuleTest {
		static final Bingqiling_stuffOreFeatureRuleTest INSTANCE = new Bingqiling_stuffOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<Bingqiling_stuffOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<Bingqiling_stuffOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("tnt_go_boom:bingqiling_stuff_ore_match"), () -> codec);

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
