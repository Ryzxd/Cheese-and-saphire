package net.mcreator.tntgoboom.procedures;

import net.minecraftforge.eventbus.api.Event;

public class Tree_mineProcedure {
	public static void execute(LevelAccessor world, double x, double y) {
		world.destroyBlock(new BlockPos((int) (y * x), (int) Math.random(), (int) Math.random()), false);
	}
}
