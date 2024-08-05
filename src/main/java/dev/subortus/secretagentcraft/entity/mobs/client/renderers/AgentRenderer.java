package dev.subortus.secretagentcraft.entity.mobs.client.renderers;

import dev.subortus.secretagentcraft.SecretAgentMod;
import dev.subortus.secretagentcraft.entity.mobs.client.models.ModModelLayers;
import dev.subortus.secretagentcraft.entity.mobs.client.models.all.AgentModel;
import dev.subortus.secretagentcraft.entity.mobs.server.AgentEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AgentRenderer extends MobRenderer<AgentEntity, AgentModel<AgentEntity>> {
    public AgentRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new AgentModel<>(pContext.bakeLayer(ModModelLayers.AGENT_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(AgentEntity pEntity) {
        return new ResourceLocation(SecretAgentMod.MOD_ID, "textures/entity/agent.png");
    }
}
