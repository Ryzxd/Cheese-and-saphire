package net.mcreator.tntgoboom.procedures;

import net.minecraftforge.eventbus.api.Event;

public class Tree_mineProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
	}
}
