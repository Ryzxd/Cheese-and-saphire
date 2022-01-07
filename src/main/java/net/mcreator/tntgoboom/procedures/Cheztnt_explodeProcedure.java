package net.mcreator.tntgoboom.procedures;

import net.minecraftforge.fmllegacy.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.client.Minecraft;

public class Cheztnt_explodeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null,
					(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.SATURATION)
							? _livEnt.getEffect(MobEffects.SATURATION).getAmplifier()
							: 0),
					(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)
							? _livEnt.getEffect(MobEffects.MOVEMENT_SLOWDOWN).getAmplifier()
							: 0),
					(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.NIGHT_VISION)
							? _livEnt.getEffect(MobEffects.NIGHT_VISION).getAmplifier()
							: 0),
					world.isClientSide()
							? Minecraft.getInstance().getConnection().getOnlinePlayers().size()
							: ServerLifecycleHooks.getCurrentServer().getPlayerCount(),
					Explosion.BlockInteraction.BREAK);
	}
}
