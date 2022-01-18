package net.mcreator.tntgoboom.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FarmlandProcedure {
	public static void execute(LevelAccessor world, double y) {
		{
			BlockPos _bp = new BlockPos((int) 50, (int) y, (int) 50);
			BlockState _bs = Blocks.FARMLAND.defaultBlockState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
				if (_property != null && _bs.getValue(_property) != null)
					try {
						_bs = _bs.setValue(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlock(_bp, _bs, 3);
		}
	}
}
