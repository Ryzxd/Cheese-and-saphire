
package net.mcreator.tntgoboom.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class StickchezwoodItem extends Item {

	public StickchezwoodItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("stickchezwood");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
