
package net.mcreator.tntgoboom.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CheztoolsSwordItem extends SwordItem {
	public CheztoolsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 660;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TntGoBoomModItems.CHEZ));
			}
		},

				3, -3f,

				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));

		setRegistryName("cheztools_sword");
	}

}
