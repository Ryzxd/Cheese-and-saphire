package net.mcreator.tntgoboom.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PoisonpotatodartshotProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 40, 1, (false), (true)));
	}
}
