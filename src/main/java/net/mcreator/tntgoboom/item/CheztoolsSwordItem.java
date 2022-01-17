
package net.mcreator.tntgoboom.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CheztoolsSwordItem extends SwordItem {
	public CheztoolsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 800;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 9998f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 125;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TntGoBoomModItems.CHEZ));
			}
		},

				3, 2f,

				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());

		setRegistryName("cheztools_sword");
	}

}
