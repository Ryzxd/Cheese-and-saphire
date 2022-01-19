
package net.mcreator.tntgoboom.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class BooletoItem extends Item {

	public BooletoItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("booleto");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
