package dev.subortus.secretagentcraft.entity.projectiles;

import dev.subortus.secretagentcraft.entity.ModEntities;
import dev.subortus.secretagentcraft.item.ModItems;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

public class PoisonDartEntity extends ThrowableItemProjectile {

    protected boolean critical;
    protected boolean fire;
    protected int power = 0;
    private double damage = 0.0D;
    protected LivingEntity shooter;

    public PoisonDartEntity(EntityType entityType, Level pLevel) {
        super(ModEntities.POISON_DART_ENTITY.get(), pLevel);
    }

    public PoisonDartEntity(Level pLevel) {
        super(ModEntities.POISON_DART_ENTITY.get(), pLevel);
    }

    public PoisonDartEntity(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.POISON_DART_ENTITY.get(), livingEntity, pLevel);
    }

    public void isCritical(boolean isIt){
        this.critical = isIt;
    }

    public void setPower(int howMuch){
        this.power = howMuch;
    }

    public void isFire(boolean isIt){
        this.fire = isIt;
    }

    public void shooter(LivingEntity player){
        this.shooter = player;
    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        LivingEntity HitEntity = (LivingEntity) pResult.getEntity();
        Entity enderman = EntityType.ENDERMAN.create(level());
        if(enderman != null){
            if(HitEntity.is(enderman)){ // Does this do anything?
                this.discard();
                HitEntity.teleportTo((this.random.nextDouble() - 0.5) * 64.0,(double)(this.random.nextInt(64) - 32),(this.random.nextDouble() - 0.5) * 64.0);
            }
        }
        if(power > 0 || critical){damage = 0.1D;}

        damage = damage + (power * 0.5D + 0.5D);

        if(critical){
            damage = damage * 2;
        }

        if(fire){
            HitEntity.hurt(damageSources().mobProjectile(this,shooter),(float) damage);
            if(!HitEntity.level().isClientSide()){
                HitEntity.addEffect(new MobEffectInstance(MobEffects.POISON, 250, 1, true, true, true));
            }
            HitEntity.setRemainingFireTicks(100);
        }else {
            HitEntity.hurt(damageSources().mobProjectile(this, shooter), (float) damage);
            if(!HitEntity.level().isClientSide()){
                HitEntity.addEffect(new MobEffectInstance(MobEffects.POISON, 250, 1, true, true, true));
            }
        }

        this.discard();
        super.onHitEntity(pResult);
    }

    @Override
    public void shootFromRotation(Entity pShooter, float pX, float pY, float pZ, float pVelocity, float pInaccuracy) {
        float f = -Mth.sin(pY * 0.017453292F) * Mth.cos(pX * 0.017453292F);
        float f1 = -Mth.sin((pX + pZ) * 0.017453292F);
        float f2 = Mth.cos(pY * 0.017453292F) * Mth.cos(pX * 0.017453292F);
        this.shoot((double)f, (double)f1, (double)f2, pVelocity, 0);
        Vec3 vec3 = pShooter.getDeltaMovement();
        this.setDeltaMovement(this.getDeltaMovement().add(vec3.x, pShooter.onGround() ? 0.0 : vec3.y, vec3.z));
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.POISON_DART.get();
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        this.spawnAtLocation(ModItems.POISON_DART.get().getDefaultInstance());
        this.discard();
        super.onHitBlock(pResult);
    }

}
