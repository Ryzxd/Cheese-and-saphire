
package net.mcreator.tntgoboom.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PotehtohOreBlock extends Block {

	public PotehtohOreBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(25f, 5f).requiresCorrectToolForDrops().friction(1f)
				.noOcclusion().isRedstoneConductor((bs, br, bp) -> false));

		setRegistryName("potehtoh_ore");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return box(2, 2, 2, 3, 3, 3)

				.move(offset.x, offset.y, offset.z);
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 7;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(TntGoBoomModBlocks.POTEHTOH_ORE, renderType -> renderType == RenderType.cutout());
	}

}
