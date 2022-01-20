package net.mcreator.tntgoboom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.core.BlockPos;

public class BonemealProcedure {
	public static void execute(LevelAccessor world, double y) {
		if (world instanceof Level _level) {
			if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, new BlockPos((int) 50, (int) y, (int) 50))
					|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, new BlockPos((int) 50, (int) y, (int) 50), null)) {
				if (!_level.isClientSide())
					_level.levelEvent(2005, new BlockPos((int) 50, (int) y, (int) 50), 0);
			}
		}
	}
}
