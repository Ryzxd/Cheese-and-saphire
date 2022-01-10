
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tntgoboom.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.tntgoboom.block.SapphireOreBlock;
import net.mcreator.tntgoboom.block.SapphireBlockBlock;
import net.mcreator.tntgoboom.block.CheeseblockBlock;
import net.mcreator.tntgoboom.block.CheeseOreBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TntGoBoomModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block SAPPHIRE_ORE = register(new SapphireOreBlock());
	public static final Block SAPPHIRE_BLOCK = register(new SapphireBlockBlock());
	public static final Block CHEESE_ORE = register(new CheeseOreBlock());
	public static final Block CHEESEBLOCK = register(new CheeseblockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SapphireOreBlock.registerRenderLayer();
		}
	}
}
