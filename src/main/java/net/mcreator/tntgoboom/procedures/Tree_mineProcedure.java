package net.mcreator.tntgoboom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Tree_mineProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
	}
}
