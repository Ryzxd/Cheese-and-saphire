
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tntgoboom.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.tntgoboom.entity.SapphiredartEntity;
import net.mcreator.tntgoboom.entity.PoisonpotatoEntity;
import net.mcreator.tntgoboom.entity.GungunEntity;
import net.mcreator.tntgoboom.entity.CheznomerEntity;
import net.mcreator.tntgoboom.entity.ChezdartEntity;
import net.mcreator.tntgoboom.entity.ArEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TntGoBoomModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<SapphiredartEntity> SAPPHIREDART = register("entitybulletsapphiredart",
			EntityType.Builder.<SapphiredartEntity>of(SapphiredartEntity::new, MobCategory.MISC).setCustomClientFactory(SapphiredartEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<PoisonpotatoEntity> POISONPOTATO = register("entitybulletpoisonpotato",
			EntityType.Builder.<PoisonpotatoEntity>of(PoisonpotatoEntity::new, MobCategory.MISC).setCustomClientFactory(PoisonpotatoEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<CheznomerEntity> CHEZNOMER = register("cheznomer",
			EntityType.Builder.<CheznomerEntity>of(CheznomerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CheznomerEntity::new).sized(0.9f, 0.9f));
	public static final EntityType<GungunEntity> GUNGUN = register("entitybulletgungun",
			EntityType.Builder.<GungunEntity>of(GungunEntity::new, MobCategory.MISC).setCustomClientFactory(GungunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ArEntity> AR = register("entitybulletar", EntityType.Builder.<ArEntity>of(ArEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ArEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ChezdartEntity> CHEZDART = register("entitybulletchezdart",
			EntityType.Builder.<ChezdartEntity>of(ChezdartEntity::new, MobCategory.MISC).setCustomClientFactory(ChezdartEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CheznomerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CHEZNOMER, CheznomerEntity.createAttributes().build());
	}
}
