
package net.mcreator.tntgoboom.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CheztoolsAxeItem extends AxeItem {
	public CheztoolsAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 800;
			}

			public float getSpeed() {
				return 43f;
			}

			public float getAttackDamageBonus() {
				return 7998f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 59;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TntGoBoomModItems.CHEZ));
			}
		},

				1, -1f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());

		setRegistryName("cheztools_axe");
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		Tree_mineProcedure.execute(world, x, y);
		return retval;
	}

}
