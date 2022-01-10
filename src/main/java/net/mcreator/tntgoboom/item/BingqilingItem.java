
package net.mcreator.tntgoboom.item;

public class BingqilingItem extends Item {

	public BingqilingItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(57).saturationMod(8.1f)

						.build()));
		setRegistryName("bingqiling");
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);

		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BingqilingFoodEatenProcedure.execute(entity);

		return retval;
	}

}
