
package net.mcreator.tntgoboom.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class Chez_woodStairsBlock extends StairBlock {

	public Chez_woodStairsBlock() {
		super(() -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(30f, 20f).dynamicShape())
				.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(30f, 20f).dynamicShape());

		setRegistryName("chez_wood_stairs");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 50;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
