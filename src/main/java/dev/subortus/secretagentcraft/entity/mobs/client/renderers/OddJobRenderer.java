package dev.subortus.secretagentcraft.entity.mobs.client.renderers;

import dev.subortus.secretagentcraft.SecretAgentMod;
import dev.subortus.secretagentcraft.entity.mobs.client.models.ModModelLayers;
import dev.subortus.secretagentcraft.entity.mobs.client.models.all.OddJobModel;
import dev.subortus.secretagentcraft.entity.mobs.server.OddJobEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class OddJobRenderer extends MobRenderer<OddJobEntity, OddJobModel<OddJobEntity>> {
    public OddJobRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new OddJobModel<>(pContext.bakeLayer(ModModelLayers.NINJA_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(OddJobEntity pEntity) {
        return new ResourceLocation(SecretAgentMod.MOD_ID, "textures/entity/oddjob.png");
    }
}
