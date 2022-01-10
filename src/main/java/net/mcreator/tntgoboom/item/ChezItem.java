
package net.mcreator.tntgoboom.item;

public class ChezItem extends Item {

	public ChezItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.4f).alwaysEat()

						.build()));
		setRegistryName("chez");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 15;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("chez"));
	}

}
