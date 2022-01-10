
package net.mcreator.tntgoboom.item;

import net.minecraft.sounds.SoundEvent;

public abstract class Cheese_squireArmorItem extends ArmorItem {

	public Cheese_squireArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1024;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{120, 120, 120, 120}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 100;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TntGoBoomModItems.DELETED_MOD_ELEMENT), new ItemStack(TntGoBoomModItems.CHEZNUGGEE));
			}

			@Override
			public String getName() {
				return "cheese_squire_armor";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends Cheese_squireArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));

			setRegistryName("cheese_squire_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tnt_go_boom:textures/models/armor/cheese_squire_layer_1.png";
		}

	}

	public static class Chestplate extends Cheese_squireArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));

			setRegistryName("cheese_squire_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tnt_go_boom:textures/models/armor/cheese_squire_layer_1.png";
		}

	}

	public static class Leggings extends Cheese_squireArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));

			setRegistryName("cheese_squire_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tnt_go_boom:textures/models/armor/cheese_squire_layer_2.png";
		}

	}

	public static class Boots extends Cheese_squireArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));

			setRegistryName("cheese_squire_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tnt_go_boom:textures/models/armor/cheese_squire_layer_1.png";
		}

	}

}
