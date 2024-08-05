package dev.subortus.secretagentcraft.entity.mobs.client.models.all;

import dev.subortus.secretagentcraft.entity.mobs.server.JungleNinjaEntity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;

public class JungleNinjaModel<T extends JungleNinjaEntity> extends HumanoidModel<T> {
    public JungleNinjaModel(ModelPart pRoot) {
        super(pRoot);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F);
        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
