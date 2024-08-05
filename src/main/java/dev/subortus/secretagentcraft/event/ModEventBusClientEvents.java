package dev.subortus.secretagentcraft.event;

import dev.subortus.secretagentcraft.SecretAgentMod;
import dev.subortus.secretagentcraft.entity.mobs.client.models.ModModelLayers;
import dev.subortus.secretagentcraft.entity.mobs.client.models.all.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SecretAgentMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.AGENT_LAYER, AgentModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.ARCH_AGENT_LAYER, ArchAgentModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NINJA_LAYER, NinjaModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.JUNGLE_NINJA_LAYER, JungleNinjaModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.ODDJOB_LAYER, OddJobModel::createBodyLayer);

    }
}
