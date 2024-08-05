package dev.subortus.secretagentcraft.item;

import dev.subortus.secretagentcraft.SecretAgentMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SecretAgentMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SECRET_AGENT_TAB = CREATIVE_MODE_TABS.register("secret_agent_tab",
            ()-> CreativeModeTab.builder().icon(()-> ModItems.GOLDEN_GUN.get().getDefaultInstance())
                    .title(Component.translatable("creativetab.secret_agent_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //Armors
                        output.accept(ModItems.BOWLER_HAT.get());
                        output.accept(ModItems.TUXEDO.get());
                        output.accept(ModItems.TUXEDO_PANTS.get());
                        output.accept(ModItems.TUXEDO_SHOES.get());

                        output.accept(ModItems.T1_BOWLER_HAT.get());
                        output.accept(ModItems.T1_TUXEDO.get());
                        output.accept(ModItems.T1_TUXEDO_PANTS.get());
                        output.accept(ModItems.T1_TUXEDO_SHOES.get());

                        output.accept(ModItems.T2_BOWLER_HAT.get());
                        output.accept(ModItems.T2_TUXEDO.get());
                        output.accept(ModItems.T2_TUXEDO_PANTS.get());
                        output.accept(ModItems.T2_TUXEDO_SHOES.get());

                        output.accept(ModItems.T3_BOWLER_HAT.get());
                        output.accept(ModItems.T3_TUXEDO.get());
                        output.accept(ModItems.T3_TUXEDO_PANTS.get());
                        output.accept(ModItems.T3_TUXEDO_SHOES.get());

                        output.accept(ModItems.T4_BOWLER_HAT.get());
                        output.accept(ModItems.T4_TUXEDO.get());
                        output.accept(ModItems.T4_TUXEDO_PANTS.get());
                        output.accept(ModItems.T4_TUXEDO_SHOES.get());

                        output.accept(ModItems.T5_BOWLER_HAT.get());
                        output.accept(ModItems.T5_TUXEDO.get());
                        output.accept(ModItems.T5_TUXEDO_PANTS.get());
                        output.accept(ModItems.T5_TUXEDO_SHOES.get());

                        output.accept(ModItems.MINI_AIR_CANISTER.get());
                        output.accept(ModItems.SELF_DESTRUCTOR.get());
                        output.accept(ModItems.NIGHT_VISION_GOGGLES.get());
                        output.accept(ModItems.EXPLODING_PEN.get());
                        output.accept(ModItems.JETPACK.get());
                        output.accept(ModItems.JETPACK_CONTROL.get());
                        output.accept(ModItems.ROCKET_FUEL.get());

                        output.accept(ModItems.BULLET.get());
                        output.accept(ModItems.GOLDEN_BULLET.get());
                        output.accept(ModItems.GUN_GRIP.get());
                        output.accept(ModItems.GOLDEN_GUN_GRIP.get());
                        output.accept(ModItems.GUN_BARREL.get());
                        output.accept(ModItems.GOLDEN_GUN_BARREL.get());
                        output.accept(ModItems.GUN_HAMMER.get());
                        output.accept(ModItems.GOLDEN_GUN_HAMMER.get());

                        output.accept(ModItems.APPLE_SEEDS.get());
                        output.accept(ModItems.CYANIDE.get());

                        output.accept(ModItems.POISON_DART.get());

                        output.accept(ModItems.IRON_DUST.get());

                        output.accept(ModItems.SMALL_ROCKET_ENGINE.get());
                        output.accept(ModItems.LARGE_ROCKET_ENGINE.get());

                        output.accept(ModItems.HAND_GUN.get());
                        output.accept(ModItems.GOLDEN_GUN.get());

                        output.accept(ModItems.THROWABLE_HAT.get());

                        output.accept(ModItems.IRON_KNUCKLES.get());
                        output.accept(ModItems.THROWING_KNIFE.get());
                        output.accept(ModItems.BLOW_GUN.get());

                        output.accept(ModItems.AGENT_SPAWN_EGG.get());
                        output.accept(ModItems.ARCH_AGENT_SPAWN_EGG.get());
                        output.accept(ModItems.NINJA_SPAWN_EGG.get());
                        output.accept(ModItems.JUNGLE_NINJA_SPAWN_EGG.get());
                        output.accept(ModItems.ODD_JOB_SPAWN_EGG.get());

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
