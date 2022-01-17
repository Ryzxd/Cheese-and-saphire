
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tntgoboom.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.tntgoboom.item.StickchezwoodItem;
import net.mcreator.tntgoboom.item.SapphiredartItem;
import net.mcreator.tntgoboom.item.SapphireSwordItem;
import net.mcreator.tntgoboom.item.SapphireShovelItem;
import net.mcreator.tntgoboom.item.SapphirePickaxeItem;
import net.mcreator.tntgoboom.item.SapphireItem;
import net.mcreator.tntgoboom.item.SapphireHoeItem;
import net.mcreator.tntgoboom.item.SapphireAxeItem;
import net.mcreator.tntgoboom.item.SapphireArmorItem;
import net.mcreator.tntgoboom.item.PoisonpotatoItem;
import net.mcreator.tntgoboom.item.IcecreamconeItem;
import net.mcreator.tntgoboom.item.EndermanarmorArmorItem;
import net.mcreator.tntgoboom.item.CheztoolsSwordItem;
import net.mcreator.tntgoboom.item.CheztoolsShovelItem;
import net.mcreator.tntgoboom.item.CheztoolsPickaxeItem;
import net.mcreator.tntgoboom.item.CheztoolsHoeItem;
import net.mcreator.tntgoboom.item.CheztoolsAxeItem;
import net.mcreator.tntgoboom.item.CheznuggeeItem;
import net.mcreator.tntgoboom.item.ChezItem;
import net.mcreator.tntgoboom.item.Cheese_squireArmorItem;
import net.mcreator.tntgoboom.item.Bingqiling_stuffSwordItem;
import net.mcreator.tntgoboom.item.Bingqiling_stuffShovelItem;
import net.mcreator.tntgoboom.item.Bingqiling_stuffPickaxeItem;
import net.mcreator.tntgoboom.item.Bingqiling_stuffIngotItem;
import net.mcreator.tntgoboom.item.Bingqiling_stuffHoeItem;
import net.mcreator.tntgoboom.item.Bingqiling_stuffAxeItem;
import net.mcreator.tntgoboom.item.Bingqiling_stuffArmorItem;
import net.mcreator.tntgoboom.item.BingqilingItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TntGoBoomModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item SAPPHIRE = register(new SapphireItem());
	public static final Item SAPPHIRE_ORE = register(TntGoBoomModBlocks.SAPPHIRE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SAPPHIRE_BLOCK = register(TntGoBoomModBlocks.SAPPHIRE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CHEZ = register(new ChezItem());
	public static final Item CHEESE_SQUIRE_ARMOR_HELMET = register(new Cheese_squireArmorItem.Helmet());
	public static final Item CHEESE_SQUIRE_ARMOR_CHESTPLATE = register(new Cheese_squireArmorItem.Chestplate());
	public static final Item CHEESE_SQUIRE_ARMOR_LEGGINGS = register(new Cheese_squireArmorItem.Leggings());
	public static final Item CHEESE_SQUIRE_ARMOR_BOOTS = register(new Cheese_squireArmorItem.Boots());
	public static final Item SAPPHIRE_PICKAXE = register(new SapphirePickaxeItem());
	public static final Item SAPPHIRE_AXE = register(new SapphireAxeItem());
	public static final Item SAPPHIRE_SWORD = register(new SapphireSwordItem());
	public static final Item SAPPHIRE_SHOVEL = register(new SapphireShovelItem());
	public static final Item SAPPHIRE_HOE = register(new SapphireHoeItem());
	public static final Item CHEESE_ORE = register(TntGoBoomModBlocks.CHEESE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SAPPHIRE_ARMOR_HELMET = register(new SapphireArmorItem.Helmet());
	public static final Item SAPPHIRE_ARMOR_CHESTPLATE = register(new SapphireArmorItem.Chestplate());
	public static final Item SAPPHIRE_ARMOR_LEGGINGS = register(new SapphireArmorItem.Leggings());
	public static final Item SAPPHIRE_ARMOR_BOOTS = register(new SapphireArmorItem.Boots());
	public static final Item CHEZNUGGEE = register(new CheznuggeeItem());
	public static final Item CHEESEBLOCK = register(TntGoBoomModBlocks.CHEESEBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BINGQILING = register(new BingqilingItem());
	public static final Item ICECREAMCONE = register(new IcecreamconeItem());
	public static final Item CHEZ_WOOD_WOOD = register(TntGoBoomModBlocks.CHEZ_WOOD_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SAPPHIREDART = register(new SapphiredartItem());
	public static final Item CHEZ_WOOD_LOG = register(TntGoBoomModBlocks.CHEZ_WOOD_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CHEZ_WOOD_PLANKS = register(TntGoBoomModBlocks.CHEZ_WOOD_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CHEZ_WOOD_LEAVES = register(TntGoBoomModBlocks.CHEZ_WOOD_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final Item POISONPOTATO = register(new PoisonpotatoItem());
	public static final Item CHEZ_WOOD_STAIRS = register(TntGoBoomModBlocks.CHEZ_WOOD_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CHEZ_WOOD_SLAB = register(TntGoBoomModBlocks.CHEZ_WOOD_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CHEZ_WOOD_FENCE = register(TntGoBoomModBlocks.CHEZ_WOOD_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item ENDERMANARMOR_ARMOR_HELMET = register(new EndermanarmorArmorItem.Helmet());
	public static final Item ENDERMANARMOR_ARMOR_CHESTPLATE = register(new EndermanarmorArmorItem.Chestplate());
	public static final Item ENDERMANARMOR_ARMOR_LEGGINGS = register(new EndermanarmorArmorItem.Leggings());
	public static final Item ENDERMANARMOR_ARMOR_BOOTS = register(new EndermanarmorArmorItem.Boots());
	public static final Item CHEZ_WOOD_FENCE_GATE = register(TntGoBoomModBlocks.CHEZ_WOOD_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final Item CHEZ_WOOD_PRESSURE_PLATE = register(TntGoBoomModBlocks.CHEZ_WOOD_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final Item CHEZ_WOOD_BUTTON = register(TntGoBoomModBlocks.CHEZ_WOOD_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CHEZTOOLS_PICKAXE = register(new CheztoolsPickaxeItem());
	public static final Item CHEZTOOLS_AXE = register(new CheztoolsAxeItem());
	public static final Item CHEZTOOLS_SWORD = register(new CheztoolsSwordItem());
	public static final Item CHEZTOOLS_SHOVEL = register(new CheztoolsShovelItem());
	public static final Item CHEZTOOLS_HOE = register(new CheztoolsHoeItem());
	public static final Item CHEZWOODWOODWOOD = register(TntGoBoomModBlocks.CHEZWOODWOODWOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item STICKCHEZWOOD = register(new StickchezwoodItem());
	public static final Item BINGQILING_STUFF_INGOT = register(new Bingqiling_stuffIngotItem());
	public static final Item BINGQILING_STUFF_ORE = register(TntGoBoomModBlocks.BINGQILING_STUFF_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BINGQILING_STUFF_BLOCK = register(TntGoBoomModBlocks.BINGQILING_STUFF_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BINGQILING_STUFF_PICKAXE = register(new Bingqiling_stuffPickaxeItem());
	public static final Item BINGQILING_STUFF_AXE = register(new Bingqiling_stuffAxeItem());
	public static final Item BINGQILING_STUFF_SWORD = register(new Bingqiling_stuffSwordItem());
	public static final Item BINGQILING_STUFF_SHOVEL = register(new Bingqiling_stuffShovelItem());
	public static final Item BINGQILING_STUFF_HOE = register(new Bingqiling_stuffHoeItem());
	public static final Item BINGQILING_STUFF_ARMOR_HELMET = register(new Bingqiling_stuffArmorItem.Helmet());
	public static final Item BINGQILING_STUFF_ARMOR_CHESTPLATE = register(new Bingqiling_stuffArmorItem.Chestplate());
	public static final Item BINGQILING_STUFF_ARMOR_LEGGINGS = register(new Bingqiling_stuffArmorItem.Leggings());
	public static final Item BINGQILING_STUFF_ARMOR_BOOTS = register(new Bingqiling_stuffArmorItem.Boots());
	public static final Item CHEZNOMER = register(
			new SpawnEggItem(TntGoBoomModEntities.CHEZNOMER, -3355648, -6711040, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("cheznomer_spawn_egg"));

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
