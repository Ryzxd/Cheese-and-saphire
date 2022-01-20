
package net.mcreator.tntgoboom.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.tntgoboom.init.TntGoBoomModSounds;

public class KeyboardcatItem extends RecordItem {
	public KeyboardcatItem() {
		super(0, TntGoBoomModSounds.REGISTRY.get(new ResourceLocation("tnt_go_boom:keyboard_cat")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("keyboardcat");
	}
}
