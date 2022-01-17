
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
import net.mcreator.tntgoboom.block.ChezwoodwoodwoodBlock;
import net.mcreator.tntgoboom.block.Chez_woodWoodBlock;
import net.mcreator.tntgoboom.block.Chez_woodStairsBlock;
import net.mcreator.tntgoboom.block.Chez_woodSlabBlock;
import net.mcreator.tntgoboom.block.Chez_woodPressurePlateBlock;
import net.mcreator.tntgoboom.block.Chez_woodPlanksBlock;
import net.mcreator.tntgoboom.block.Chez_woodLogBlock;
import net.mcreator.tntgoboom.block.Chez_woodLeavesBlock;
import net.mcreator.tntgoboom.block.Chez_woodFenceGateBlock;
import net.mcreator.tntgoboom.block.Chez_woodFenceBlock;
import net.mcreator.tntgoboom.block.Chez_woodButtonBlock;
import net.mcreator.tntgoboom.block.CheeseblockBlock;
import net.mcreator.tntgoboom.block.CheeseOreBlock;
import net.mcreator.tntgoboom.block.Bingqiling_stuffOreBlock;
import net.mcreator.tntgoboom.block.Bingqiling_stuffBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TntGoBoomModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block SAPPHIRE_ORE = register(new SapphireOreBlock());
	public static final Block SAPPHIRE_BLOCK = register(new SapphireBlockBlock());
	public static final Block CHEESE_ORE = register(new CheeseOreBlock());
	public static final Block CHEESEBLOCK = register(new CheeseblockBlock());
	public static final Block CHEZ_WOOD_WOOD = register(new Chez_woodWoodBlock());
	public static final Block CHEZ_WOOD_LOG = register(new Chez_woodLogBlock());
	public static final Block CHEZ_WOOD_PLANKS = register(new Chez_woodPlanksBlock());
	public static final Block CHEZ_WOOD_LEAVES = register(new Chez_woodLeavesBlock());
	public static final Block CHEZ_WOOD_STAIRS = register(new Chez_woodStairsBlock());
	public static final Block CHEZ_WOOD_SLAB = register(new Chez_woodSlabBlock());
	public static final Block CHEZ_WOOD_FENCE = register(new Chez_woodFenceBlock());
	public static final Block CHEZ_WOOD_FENCE_GATE = register(new Chez_woodFenceGateBlock());
	public static final Block CHEZ_WOOD_PRESSURE_PLATE = register(new Chez_woodPressurePlateBlock());
	public static final Block CHEZ_WOOD_BUTTON = register(new Chez_woodButtonBlock());
	public static final Block CHEZWOODWOODWOOD = register(new ChezwoodwoodwoodBlock());
	public static final Block BINGQILING_STUFF_ORE = register(new Bingqiling_stuffOreBlock());
	public static final Block BINGQILING_STUFF_BLOCK = register(new Bingqiling_stuffBlockBlock());

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
