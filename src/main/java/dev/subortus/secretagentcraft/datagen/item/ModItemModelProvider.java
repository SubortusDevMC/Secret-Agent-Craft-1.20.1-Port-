package dev.subortus.secretagentcraft.datagen.item;

import dev.subortus.secretagentcraft.SecretAgentMod;
import dev.subortus.secretagentcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;


public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SecretAgentMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BOWLER_HAT, "generated");
        simpleItem(ModItems.TUXEDO, "generated");
        simpleItem(ModItems.TUXEDO_PANTS, "generated");
        simpleItem(ModItems.TUXEDO_SHOES, "generated");
        simpleItem(ModItems.T1_BOWLER_HAT, "generated");
        simpleItem(ModItems.T1_TUXEDO, "generated");
        simpleItem(ModItems.T1_TUXEDO_PANTS, "generated");
        simpleItem(ModItems.T1_TUXEDO_SHOES, "generated");
        simpleItem(ModItems.T2_BOWLER_HAT, "generated");
        simpleItem(ModItems.T2_TUXEDO, "generated");
        simpleItem(ModItems.T2_TUXEDO_PANTS, "generated");
        simpleItem(ModItems.T2_TUXEDO_SHOES, "generated");
        simpleItem(ModItems.T3_BOWLER_HAT, "generated");
        simpleItem(ModItems.T3_TUXEDO, "generated");
        simpleItem(ModItems.T3_TUXEDO_PANTS, "generated");
        simpleItem(ModItems.T3_TUXEDO_SHOES, "generated");
        simpleItem(ModItems.T4_BOWLER_HAT, "generated");
        simpleItem(ModItems.T4_TUXEDO, "generated");
        simpleItem(ModItems.T4_TUXEDO_PANTS, "generated");
        simpleItem(ModItems.T4_TUXEDO_SHOES, "generated");
        simpleItem(ModItems.T5_BOWLER_HAT, "generated");
        simpleItem(ModItems.T5_TUXEDO, "generated");
        simpleItem(ModItems.T5_TUXEDO_PANTS, "generated");
        simpleItem(ModItems.T5_TUXEDO_SHOES, "generated");

        simpleItem(ModItems.MINI_AIR_CANISTER, "generated");
        simpleItem(ModItems.SELF_DESTRUCTOR, "generated");
        simpleItem(ModItems.NIGHT_VISION_GOGGLES, "generated");
        simpleItem(ModItems.EXPLODING_PEN, "generated");
        simpleItem(ModItems.JETPACK, "generated");
        simpleItem(ModItems.JETPACK_CONTROL, "generated");
        simpleItem(ModItems.ROCKET_FUEL, "generated");

        simpleItem(ModItems.BULLET, "generated");
        simpleItem(ModItems.GOLDEN_BULLET, "generated");
        simpleItem(ModItems.GUN_GRIP, "generated");
        simpleItem(ModItems.GOLDEN_GUN_GRIP, "generated");
        simpleItem(ModItems.GUN_BARREL, "generated");
        simpleItem(ModItems.GOLDEN_GUN_BARREL, "generated");
        simpleItem(ModItems.GUN_HAMMER, "generated");
        simpleItem(ModItems.GOLDEN_GUN_HAMMER, "generated");

        simpleItem(ModItems.APPLE_SEEDS, "generated");
        simpleItem(ModItems.CYANIDE, "generated");

        simpleItem(ModItems.POISON_DART, "generated");
        simpleItem(ModItems.IRON_DUST, "generated");

        simpleItem(ModItems.SMALL_ROCKET_ENGINE, "generated");
        simpleItem(ModItems.LARGE_ROCKET_ENGINE, "generated");

        simpleItem(ModItems.THROWABLE_HAT, "generated");

        simpleItem(ModItems.IRON_KNUCKLES, "handheld");
        simpleItem(ModItems.THROWING_KNIFE, "handheld");

        withExistingParent(ModItems.AGENT_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.ARCH_AGENT_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.NINJA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.JUNGLE_NINJA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.ODD_JOB_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item, String type){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/"+type)).texture("layer0",
                new ResourceLocation(SecretAgentMod.MOD_ID, "item/" + item.getId().getPath()));
    }


}
