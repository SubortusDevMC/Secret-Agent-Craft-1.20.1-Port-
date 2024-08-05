package dev.subortus.secretagentcraft.item.gadgets;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SelfDestructorItem extends Item {
    public SelfDestructorItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        pLevel.playSound(pPlayer,pPlayer.getOnPos(), SoundEvents.GENERIC_EXPLODE, SoundSource.PLAYERS);

        if(!pPlayer.getAbilities().instabuild){
            pPlayer.getItemInHand(pUsedHand).shrink(1);
        }

        pLevel.explode(null,pPlayer.getX(),pPlayer.getY(),pPlayer.getZ(), 4.0f, true, Level.ExplosionInteraction.MOB);

        if(!pPlayer.getAbilities().instabuild){
            pPlayer.setHealth(0.0f);
        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
