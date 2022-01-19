
package net.mcreator.tntgoboom.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PotehtohHoeItem extends HoeItem {
	public PotehtohHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 500;
			}

			public float getSpeed() {
				return 40f;
			}

			public float getAttackDamageBonus() {
				return 0f;
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

				0, -3f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));

		setRegistryName("potehtoh_hoe");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("ur mom"));
	}

}
