package net.mcreator.tntgoboom.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PotehtohswordhitProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 30, 1, (false), (false)));
		if (sourceentity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 1, (false), (false)));
	}
}
