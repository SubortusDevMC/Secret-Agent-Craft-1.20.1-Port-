package dev.subortus.secretagentcraft.entity.mobs.client.renderers;

import dev.subortus.secretagentcraft.SecretAgentMod;
import dev.subortus.secretagentcraft.entity.mobs.client.models.ModModelLayers;
import dev.subortus.secretagentcraft.entity.mobs.client.models.all.JungleNinjaModel;
import dev.subortus.secretagentcraft.entity.mobs.server.JungleNinjaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class JungleNinjaRenderer extends MobRenderer<JungleNinjaEntity, JungleNinjaModel<JungleNinjaEntity>> {
    public JungleNinjaRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new JungleNinjaModel<>(pContext.bakeLayer(ModModelLayers.JUNGLE_NINJA_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(JungleNinjaEntity pEntity) {
        return new ResourceLocation(SecretAgentMod.MOD_ID, "textures/entity/jungle_ninja.png");
    }
}
