
package net.mcreator.tntgoboom.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ChezdartEntity extends AbstractArrow implements ItemSupplier {

	public ChezdartEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		super(TntGoBoomModEntities.CHEZDART, world);
	}

	public ChezdartEntity(EntityType<? extends ChezdartEntity> type, Level world) {
		super(type, world);
	}

	public ChezdartEntity(EntityType<? extends ChezdartEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ChezdartEntity(EntityType<? extends ChezdartEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(TntGoBoomModItems.CHEZDART);
	}

	@Override
	protected ItemStack getPickupItem() {
		return null;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity entity = this.getOwner();
		Entity imediatesourceentity = this;
		if (this.inGround) {
			this.discard();
		}
	}

	public static ChezdartEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		ChezdartEntity entityarrow = new ChezdartEntity(TntGoBoomModEntities.CHEZDART, entity, world);
		entityarrow.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);

		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));

		return entityarrow;
	}

	public static ChezdartEntity shoot(LivingEntity entity, LivingEntity target) {
		ChezdartEntity entityarrow = new ChezdartEntity(TntGoBoomModEntities.CHEZDART, entity, entity.level);
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 1f * 2, 12.0F);

		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(20);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);

		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.level.playSound((Player) null, (double) x, (double) y, (double) z,
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));

		return entityarrow;
	}

}
