package dev.subortus.secretagentcraft.item.gadgets;

import dev.subortus.secretagentcraft.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class JetpackController extends Item {
    public JetpackController(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getUseDuration(ItemStack pStack) {
        // Dunno, I just felt like adding this because Dr_Sideburns did in the 1.6.4 version of his mod.
        return 72000;
    }

    // "onUseTick" is for when right click is held down.
    @Override
    public void onUseTick(Level pLevel, LivingEntity pLivingEntity, ItemStack pStack, int pRemainingUseDuration) {
        // Not on Ground AND not in Water
        if(!pLivingEntity.onGround() && !pLivingEntity.isInWater()){
            // Launch the player to the stratosphere
            pLivingEntity.setDeltaMovement(pLivingEntity.getMotionDirection().getStepX() * 1.4f, 1.1f, pLivingEntity.getMotionDirection().getStepZ() * 1.4f);
            // Mock them with fizzy noises
            pLivingEntity.level().playSound(((Player) pLivingEntity), pLivingEntity.getX(), pLivingEntity.getY(), pLivingEntity.getZ(), SoundEvents.LAVA_EXTINGUISH, SoundSource.PLAYERS, 0.3f, 0.1f);
        }

        if(pLivingEntity.onGround()){
            // Stop using the item if you touched the ground.
            pLivingEntity.stopUsingItem();
        }

        // This is used to prevent the player from dying instantly after touching said ground.
        pLivingEntity.fallDistance = 0.0f;

        super.onUseTick(pLevel, pLivingEntity, pStack, pRemainingUseDuration);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        // Make sure this player isn't already flying. That would cause a bug.
        if (!pPlayer.getAbilities().flying) {
            // This is used to get the item in the chest-plate slot.
            ItemStack chest = pPlayer.getInventory().getArmor(2);
            // This detects if the item on the chestplate is equal the Jetpack.
            if (chest.getItem() == ModItems.JETPACK.get().asItem()) {
                // This tests if the player has rocket fuel or is in creative.
                if (pPlayer.getInventory().contains(ModItems.ROCKET_FUEL.get().getDefaultInstance()) || pPlayer.isCreative()) {
                    // Is the player on the ground.
                    if (!pPlayer.onGround()) {
                        // You can read this like english. Player starts using item -> Used Hand.
                        pPlayer.startUsingItem(pUsedHand);
                        // If player is not in creative.
                        if (!pPlayer.getAbilities().instabuild) {
                            //Itemstack variable fuel is equal to the item in the inventory slot that is the slot with rocket fuel.
                            ItemStack fuel = pPlayer.getInventory().getItem(pPlayer.getInventory().findSlotMatchingItem(ModItems.ROCKET_FUEL.get().getDefaultInstance()));

                            // Minus one rocket fuel.
                            fuel.shrink(1);
                        }
                    }
                    // Slide cancel - just kidding. Movement cancel.
                    pPlayer.setDeltaMovement(0.0f, 0.0f, 0.0f);
                    // If what is being run is serverside. (! = NOT)
                    if (!pPlayer.level().isClientSide()) {
                        // Play a sound at to the player, at their coordinates, the sound is Extinguished lava, and the Sound Setting is PLAYERS. Volume is 1.2x louder. The pitch is 0.4x higher.
                        pPlayer.level().playSound(pPlayer, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), SoundEvents.LAVA_EXTINGUISH, SoundSource.PLAYERS, 1.2f, 0.4f);
                    }
                }
            }
        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
