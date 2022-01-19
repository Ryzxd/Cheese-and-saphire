
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tntgoboom.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.tntgoboom.client.renderer.CheznomerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TntGoBoomModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TntGoBoomModEntities.SAPPHIREDART, ThrownItemRenderer::new);
		event.registerEntityRenderer(TntGoBoomModEntities.POISONPOTATO, ThrownItemRenderer::new);
		event.registerEntityRenderer(TntGoBoomModEntities.CHEZNOMER, CheznomerRenderer::new);
		event.registerEntityRenderer(TntGoBoomModEntities.GUNGUN, ThrownItemRenderer::new);
		event.registerEntityRenderer(TntGoBoomModEntities.AR, ThrownItemRenderer::new);
		event.registerEntityRenderer(TntGoBoomModEntities.CHEZDART, ThrownItemRenderer::new);
	}
}
