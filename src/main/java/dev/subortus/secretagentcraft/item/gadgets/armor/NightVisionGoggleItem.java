package dev.subortus.secretagentcraft.item.gadgets.armor;

import dev.subortus.secretagentcraft.item.materials.armor.ModArmorMaterials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class NightVisionGoggleItem extends ArmorItem {
    public NightVisionGoggleItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if(!level.isClientSide()){
            if(!player.getInventory().getArmor(3).isEmpty()){
                if(player.getInventory().getArmor(3).getItem() instanceof ArmorItem){
                    if(((ArmorItem) player.getInventory().getArmor(3).getItem()).getMaterial() == ModArmorMaterials.NVG){
                        if(!player.hasEffect(MobEffects.NIGHT_VISION)){
                            player.addEffect( new MobEffectInstance(MobEffects.NIGHT_VISION, 400,  1,false, false, false));
                    } else if(player.getEffect(MobEffects.NIGHT_VISION).endsWithin(399)){
                            player.addEffect( new MobEffectInstance(MobEffects.NIGHT_VISION, 400,  1,false, false, false));
                        }
                    }
                }
            }
        }
    }
}
