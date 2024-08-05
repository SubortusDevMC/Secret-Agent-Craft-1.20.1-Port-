package dev.subortus.secretagentcraft.item.weapons;

import dev.subortus.secretagentcraft.entity.projectiles.BulletEntity;
import dev.subortus.secretagentcraft.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

import java.util.Set;

public class HandGunItem extends Item {
    public HandGunItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return enchantment == Enchantments.POWER_ARROWS || enchantment == Enchantments.INFINITY_ARROWS || enchantment == Enchantments.FIRE_ASPECT;
    }

    @Override
    public boolean isEnchantable(ItemStack pStack) {
        return true;
    }

    @Override
    public int getUseDuration(ItemStack pStack) {
        return 72000;
    }

    @Override
    public void onStopUsing(ItemStack stack, LivingEntity entity, int count) {
        Level level = entity.level();

        int j = this.getUseDuration(stack) - count;

        ArrowLooseEvent event = new ArrowLooseEvent(((Player) entity),stack,level,count,true);
        MinecraftForge.EVENT_BUS.post(event);
        if(event.isCanceled()){
            return;
        }

        boolean flag = ((Player) entity).getAbilities().instabuild || ((Player) entity).getItemInHand(entity.getUsedItemHand()).getItem().getEnchantmentLevel(stack,Enchantments.INFINITY_ARROWS) > 0;

        if(flag || ((Player) entity).getInventory().hasAnyOf(Set.of(ModItems.BULLET.get()))){
            float f = (float)j / 20.0f;
            f = (f * f + f * 2.0f) / 3.0f; // No idea what these equations are but Dr_Sideburns uses it in his GunItem Class.

            if((double)f < 0.1D){
                return;
            }

            if(f > 0.1f){
                f = 1.0f;
            }

            BulletEntity bullet = new BulletEntity(level, entity);
            bullet.setItem(ModItems.BULLET.get().getDefaultInstance());
            bullet.shootFromRotation(entity, entity.getXRot(), entity.getYRot(), 0.0F, f * 4.0f, 1.0F);

            if(f == 1.0f){
                bullet.isCritical(true);
            }

            if(stack.getEnchantmentLevel(Enchantments.POWER_ARROWS) > 0){
                bullet.setPower(stack.getEnchantmentLevel(Enchantments.POWER_ARROWS));
            }

            if(stack.getEnchantmentLevel(Enchantments.FIRE_ASPECT) > 0){
                bullet.isFire(true);
            }

            bullet.shooter(entity);
            stack.hurtAndBreak(1,entity, entityBreak -> entity.broadcastBreakEvent(entity.getUsedItemHand()));
            level.playSound(entity,entity.getOnPos(), SoundEvents.ZOMBIE_ATTACK_IRON_DOOR, SoundSource.PLAYERS, 3.0f, 1.0f);
            level.playSound(entity,entity.getOnPos(), SoundEvents.GENERIC_EXPLODE, SoundSource.PLAYERS, 0.5f, 1.0f);

            if(!((Player) entity).getAbilities().instabuild){
                ((Player) entity).getInventory().getItem(((Player) entity).getInventory().findSlotMatchingItem(
                        ModItems.BULLET.get().getDefaultInstance())).shrink(1);
            }

            if(!level.isClientSide()){
                level.addFreshEntity(bullet);
            }
        }

        super.onStopUsing(stack, entity, count);
    }

    @Override
    public void onUseTick(Level pLevel, LivingEntity pLivingEntity, ItemStack pStack, int pRemainingUseDuration) {
        super.onUseTick(pLevel, pLivingEntity, pStack, pRemainingUseDuration);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack stack = pPlayer.getItemInHand(pUsedHand).getItem().getDefaultInstance();
        ArrowNockEvent event = new ArrowNockEvent(pPlayer,stack,pUsedHand,pLevel,true);
        MinecraftForge.EVENT_BUS.post(event);
        if(event.isCanceled()){
            event.getResult();
        }

        if((pPlayer.getAbilities().instabuild || pPlayer.getInventory().hasAnyOf(Set.of(ModItems.BULLET.get())))){
            pPlayer.startUsingItem(pUsedHand);
        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.BOW;
    }
}
