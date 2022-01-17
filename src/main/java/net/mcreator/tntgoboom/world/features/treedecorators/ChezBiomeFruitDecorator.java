package net.mcreator.tntgoboom.world.features.treedecorators;

public class ChezBiomeFruitDecorator extends CocoaDecorator {

    public static final ChezBiomeFruitDecorator INSTANCE = new ChezBiomeFruitDecorator();

    public static com.mojang.serialization.Codec<ChezBiomeFruitDecorator> codec;
    public static TreeDecoratorType<?> tdt;

    static {
        codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
        tdt = new TreeDecoratorType<>(codec);
        tdt.setRegistryName("chez_biome_tree_fruit_decorator");
        ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
    }

    public ChezBiomeFruitDecorator() {
        super(0.2f);
    }

    @Override protected TreeDecoratorType<?> type() {
        return tdt;
    }

    @Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */

}
