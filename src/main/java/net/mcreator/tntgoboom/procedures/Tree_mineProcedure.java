package net.mcreator.tntgoboom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Tree_mineProcedure {
	public static void execute(LevelAccessor world, double x, double y) {
		world.destroyBlock(new BlockPos((int) (y * x), (int) Math.random(), (int) Math.random()), false);
	}
}
