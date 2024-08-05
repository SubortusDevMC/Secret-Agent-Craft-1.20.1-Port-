package dev.subortus.secretagentcraft.event;

import dev.subortus.secretagentcraft.SecretAgentMod;
import dev.subortus.secretagentcraft.entity.ModEntities;
import dev.subortus.secretagentcraft.entity.mobs.server.AgentEntity;
import dev.subortus.secretagentcraft.entity.mobs.server.JungleNinjaEntity;
import dev.subortus.secretagentcraft.entity.mobs.server.NinjaEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SecretAgentMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.AGENT.get(), AgentEntity.createAttributes().build());
        event.put(ModEntities.ARCH_AGENT.get(), AgentEntity.createAttributes().build());
        event.put(ModEntities.NINJA.get(), NinjaEntity.createAttributes().build());
        event.put(ModEntities.JUNGLE_NINJA.get(), JungleNinjaEntity.createAttributes().build());
        event.put(ModEntities.ODDJOB_ENTITY.get(), JungleNinjaEntity.createAttributes().build());

    }
}
