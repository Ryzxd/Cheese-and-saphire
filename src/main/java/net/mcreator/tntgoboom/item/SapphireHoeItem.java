
package net.mcreator.tntgoboom.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SapphireHoeItem extends HoeItem {
	public SapphireHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 200;
			}

			public float getSpeed() {
				return 9.5f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TntGoBoomModItems.DELETED_MOD_ELEMENT));
			}
		},

				0, -2.5f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));

		setRegistryName("sapphire_hoe");
	}

}
