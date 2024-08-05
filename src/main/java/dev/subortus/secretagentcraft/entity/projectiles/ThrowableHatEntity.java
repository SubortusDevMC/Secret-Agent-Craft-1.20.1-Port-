package dev.subortus.secretagentcraft.entity.projectiles;

import dev.subortus.secretagentcraft.entity.ModEntities;
import dev.subortus.secretagentcraft.item.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class ThrowableHatEntity extends ThrowableItemProjectile {

    protected Player shooter;
    public void shooter(Player player){
        this.shooter = player;
    }

    public ThrowableHatEntity(EntityType entityType, Level pLevel) {
        super(ModEntities.THROWABLE_HAT_PROJECTILE.get(), pLevel);
    }

    public ThrowableHatEntity(Level pLevel) {
        super(ModEntities.THROWABLE_HAT_PROJECTILE.get(), pLevel);
    }

    public ThrowableHatEntity(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.THROWABLE_HAT_PROJECTILE.get(), livingEntity, pLevel);
    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        Entity pHitEntity = pResult.getEntity();
        pHitEntity.hurt(damageSources().mobProjectile(this, this.shooter),10.0f);
        this.spawnAtLocation(this.getDefaultItem());
        this.discard();
        super.onHitEntity(pResult);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.THROWABLE_HAT.get();
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        this.spawnAtLocation(this.getDefaultItem());
        this.discard();
        super.onHitBlock(pResult);
    }

}
