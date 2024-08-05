package dev.subortus.secretagentcraft.entity.mobs.client.renderers;

import dev.subortus.secretagentcraft.SecretAgentMod;
import dev.subortus.secretagentcraft.entity.mobs.client.models.ModModelLayers;
import dev.subortus.secretagentcraft.entity.mobs.client.models.all.NinjaModel;
import dev.subortus.secretagentcraft.entity.mobs.server.NinjaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class NinjaRenderer extends MobRenderer<NinjaEntity, NinjaModel<NinjaEntity>> {
    public NinjaRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new NinjaModel<>(pContext.bakeLayer(ModModelLayers.NINJA_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(NinjaEntity pEntity) {
        return new ResourceLocation(SecretAgentMod.MOD_ID, "textures/entity/ninja.png");
    }
}
