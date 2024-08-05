package dev.subortus.secretagentcraft.entity.mobs.client.renderers;

import dev.subortus.secretagentcraft.SecretAgentMod;
import dev.subortus.secretagentcraft.entity.mobs.client.models.ModModelLayers;
import dev.subortus.secretagentcraft.entity.mobs.client.models.all.ArchAgentModel;
import dev.subortus.secretagentcraft.entity.mobs.server.ArchAgentEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ArchAgentRenderer extends MobRenderer<ArchAgentEntity, ArchAgentModel<ArchAgentEntity>> {
    public ArchAgentRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ArchAgentModel<>(pContext.bakeLayer(ModModelLayers.ARCH_AGENT_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(ArchAgentEntity pEntity) {
        return new ResourceLocation(SecretAgentMod.MOD_ID, "textures/entity/arch_agent.png");
    }
}
