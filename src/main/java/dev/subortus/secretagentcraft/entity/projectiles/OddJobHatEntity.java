package dev.subortus.secretagentcraft.entity.projectiles;

import dev.subortus.secretagentcraft.entity.ModEntities;
import dev.subortus.secretagentcraft.item.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class OddJobHatEntity extends ThrowableItemProjectile {

    protected LivingEntity shooter;
    public void shooter(LivingEntity player){
        this.shooter = player;
    }

    public OddJobHatEntity(EntityType entityType, Level pLevel) {
        super(ModEntities.THROWABLE_HAT_PROJECTILE.get(), pLevel);
    }

    public OddJobHatEntity(Level pLevel) {
        super(ModEntities.THROWABLE_HAT_PROJECTILE.get(), pLevel);
    }

    public OddJobHatEntity(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.THROWABLE_HAT_PROJECTILE.get(), livingEntity, pLevel);
    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        Entity pHitEntity = pResult.getEntity();
        pHitEntity.hurt(damageSources().mobProjectile(this, this.shooter),10.0f);
        this.discard();
        super.onHitEntity(pResult);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.THROWABLE_HAT.get();
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        this.discard();
        super.onHitBlock(pResult);
    }

}
