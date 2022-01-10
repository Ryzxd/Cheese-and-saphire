
package net.mcreator.tntgoboom.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SapphireSwordItem extends SwordItem {
	public SapphireSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 300;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 5.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TntGoBoomModItems.SAPPHIRE));
			}
		},

				3, -1f,

				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));

		setRegistryName("sapphire_sword");
	}

}
