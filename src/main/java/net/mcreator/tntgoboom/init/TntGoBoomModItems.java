
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tntgoboom.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.tntgoboom.item.IcecreamconeItem;
import net.mcreator.tntgoboom.item.CheznuggeeItem;
import net.mcreator.tntgoboom.item.ChezItem;
import net.mcreator.tntgoboom.item.Cheese_squireArmorItem;
import net.mcreator.tntgoboom.item.BingqilingItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TntGoBoomModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item CHEZ = register(new ChezItem());
	public static final Item CHEESE_SQUIRE_ARMOR_HELMET = register(new Cheese_squireArmorItem.Helmet());
	public static final Item CHEESE_SQUIRE_ARMOR_CHESTPLATE = register(new Cheese_squireArmorItem.Chestplate());
	public static final Item CHEESE_SQUIRE_ARMOR_LEGGINGS = register(new Cheese_squireArmorItem.Leggings());
	public static final Item CHEESE_SQUIRE_ARMOR_BOOTS = register(new Cheese_squireArmorItem.Boots());
	public static final Item CHEESE_ORE = register(TntGoBoomModBlocks.CHEESE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CHEZNUGGEE = register(new CheznuggeeItem());
	public static final Item CHEESEBLOCK = register(TntGoBoomModBlocks.CHEESEBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BINGQILING = register(new BingqilingItem());
	public static final Item ICECREAMCONE = register(new IcecreamconeItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
