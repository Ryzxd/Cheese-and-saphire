
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tntgoboom.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TntGoBoomModTabs {
	public static CreativeModeTab TAB_SAPHIRE;
	public static CreativeModeTab TAB_CHEZTHING;

	public static void load() {
		TAB_SAPHIRE = new CreativeModeTab("tabsaphire") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TntGoBoomModItems.SAPPHIRE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_CHEZTHING = new CreativeModeTab("tabchezthing") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TntGoBoomModBlocks.CHEESEBLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
