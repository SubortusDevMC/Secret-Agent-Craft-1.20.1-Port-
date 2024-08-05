package dev.subortus.secretagentcraft.entity.mobs.server;

import dev.subortus.secretagentcraft.entity.projectiles.BulletEntity;
import dev.subortus.secretagentcraft.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class AgentEntity extends Monster implements RangedAttackMob {
    public AgentEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this,1.1D,60, 10.0f));
        this.goalSelector.addGoal(3, new FleeSunGoal(this,1.1D));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1D));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class,8.0f));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));

        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class,true));
    }

    public static AttributeSupplier.Builder createAttributes(){
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 50.0D)
                .add(Attributes.FOLLOW_RANGE, 80.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.VILLAGER_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.VILLAGER_DEATH;
    }

    @Override
    public void tick() {
        super.tick();
    }

    @Override
    protected void dropCustomDeathLoot(DamageSource pSource, int pLooting, boolean pRecentlyHit) {
        super.dropCustomDeathLoot(pSource, pLooting, pRecentlyHit);
        if(!this.level().isClientSide()){
            int i = 0;
            do {
                this.spawnAtLocation(ModItems.BULLET.get().getDefaultInstance());
                i++;
            } while (i < random.nextInt(1, 7));
            if(random.nextInt(3) == 0) {
                ItemStack item = new ItemStack(ModItems.HAND_GUN.get());
                item.setDamageValue(random.nextInt(385));
                if(random.nextInt(6) == 0){
                    item.enchant(Enchantments.POWER_ARROWS,random.nextInt(1,5));
                }
                this.spawnAtLocation(item);
            }
        }
    }

    @Override
    public void performRangedAttack(@NotNull LivingEntity pTarget, float pVelocity) {
        this.shoot(pTarget);
    }

    public void shoot(LivingEntity pTarget){
        BulletEntity bullet = new BulletEntity(this.level(), this);
        bullet.setItem(ModItems.BULLET.get().getDefaultInstance());
        double d0 = pTarget.getEyeY() - (double)1.1F;
        double d1 = pTarget.getX() - this.getX();
        double d2 = d0 - bullet.getY();
        double d3 = pTarget.getZ() - this.getZ();
        double d4 = Math.sqrt(d1 * d1 + d3 * d3) * (double)0.2F;
        bullet.shoot(d1, d2 + d4, d3, 4.0F, 1.0F);
        bullet.shooter(this);
        if (!this.isSilent()) {
            this.level().playSound(null,this.getOnPos(), SoundEvents.ZOMBIE_ATTACK_IRON_DOOR, SoundSource.PLAYERS, 3.0f, 1.0f);
            this.level().playSound(null,this.getOnPos(), SoundEvents.GENERIC_EXPLODE, SoundSource.PLAYERS, 0.5f, 1.0f);
        }

        this.level().addFreshEntity(bullet);
    }

}
