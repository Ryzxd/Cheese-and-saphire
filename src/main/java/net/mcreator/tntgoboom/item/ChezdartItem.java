
package net.mcreator.tntgoboom.item;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class ChezdartItem extends Item {

	public ChezdartItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(64));
		setRegistryName("chezdart");
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("chez"));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.SPEAR;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {

				ChezdartEntity entityarrow = ChezdartEntity.shoot(world, entity, world.getRandom(), 1f, 20, 5);

				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));

				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;

			}
		}
	}

}
