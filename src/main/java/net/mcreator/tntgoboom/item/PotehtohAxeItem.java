
package net.mcreator.tntgoboom.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PotehtohAxeItem extends AxeItem {
	public PotehtohAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 500;
			}

			public float getSpeed() {
				return 52f;
			}

			public float getAttackDamageBonus() {
				return 14f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TntGoBoomModItems.POTEHTOH));
			}
		},

				1, -3f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));

		setRegistryName("potehtoh_axe");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("choppy boi"));
	}

}
