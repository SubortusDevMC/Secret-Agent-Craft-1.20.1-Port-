package dev.subortus.secretagentcraft.entity.mobs.client.models;

import dev.subortus.secretagentcraft.SecretAgentMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation AGENT_LAYER =
            new ModelLayerLocation(new ResourceLocation(SecretAgentMod.MOD_ID, "agent_layer"), "main");
    public static final ModelLayerLocation ARCH_AGENT_LAYER =
            new ModelLayerLocation(new ResourceLocation(SecretAgentMod.MOD_ID, "arch_agent_layer"), "main");
    public static final ModelLayerLocation NINJA_LAYER =
            new ModelLayerLocation(new ResourceLocation(SecretAgentMod.MOD_ID, "ninja_layer"), "main");
    public static final ModelLayerLocation JUNGLE_NINJA_LAYER =
            new ModelLayerLocation(new ResourceLocation(SecretAgentMod.MOD_ID, "jungle_ninja_layer"), "main");
    public static final ModelLayerLocation ODDJOB_LAYER =
            new ModelLayerLocation(new ResourceLocation(SecretAgentMod.MOD_ID, "oddjob_layer"), "main");
}
