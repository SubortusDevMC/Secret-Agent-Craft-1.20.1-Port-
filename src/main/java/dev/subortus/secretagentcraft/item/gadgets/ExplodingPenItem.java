package dev.subortus.secretagentcraft.item.gadgets;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ExplodingPenItem extends Item {
    public ExplodingPenItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

        pLevel.playSound(pPlayer,pPlayer.getOnPos(), SoundEvents.GENERIC_EXPLODE, SoundSource.PLAYERS);

        if(!pPlayer.getAbilities().instabuild) {
            pPlayer.getItemInHand(pUsedHand).shrink(1);
        }

        pPlayer.setInvulnerable(true);
        pLevel.explode(null,pPlayer.getX(),pPlayer.getY(),pPlayer.getZ(), 1.0f, false, Level.ExplosionInteraction.NONE);
        if(!pPlayer.getAbilities().instabuild) {
            pPlayer.setInvulnerable(false);
        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
