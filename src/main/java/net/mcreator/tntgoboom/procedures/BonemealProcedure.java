package net.mcreator.tntgoboom.procedures;

import net.minecraftforge.eventbus.api.Event;

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
