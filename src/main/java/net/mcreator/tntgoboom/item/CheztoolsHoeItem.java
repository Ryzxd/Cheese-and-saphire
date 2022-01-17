
package net.mcreator.tntgoboom.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;

import net.mcreator.tntgoboom.procedures.FarmlandProcedure;
import net.mcreator.tntgoboom.procedures.BonemealProcedure;
import net.mcreator.tntgoboom.init.TntGoBoomModItems;

public class CheztoolsHoeItem extends HoeItem {
	public CheztoolsHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 127999;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TntGoBoomModItems.CHEZ));
			}
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("cheztools_hoe");
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		BonemealProcedure.execute(context.getLevel(), context.getClickedPos().getY());
		return retval;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		FarmlandProcedure.execute(entity.level, entity.getY());
		return retval;
	}
}
