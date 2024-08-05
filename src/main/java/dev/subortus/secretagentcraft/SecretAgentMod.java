package dev.subortus.secretagentcraft;

import com.mojang.logging.LogUtils;
import dev.subortus.secretagentcraft.entity.ModEntities;
import dev.subortus.secretagentcraft.entity.mobs.client.renderers.*;
import dev.subortus.secretagentcraft.item.ModCreativeModeTabs;
import dev.subortus.secretagentcraft.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SecretAgentMod.MOD_ID)
public class SecretAgentMod
{

    public static final String MOD_ID = "secretagentcraft";

    private static final Logger LOGGER = LogUtils.getLogger();

    public SecretAgentMod(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);

        ModEntities.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.BULLET_PROJECTILE.get(), ThrownItemRenderer::new);
            EntityRenderers.register(ModEntities.GOLDEN_BULLET_PROJECTILE.get(), ThrownItemRenderer::new);
            EntityRenderers.register(ModEntities.THROWABLE_HAT_PROJECTILE.get(), ThrownItemRenderer::new);
            EntityRenderers.register(ModEntities.ODDJOB_HAT_PROJECTILE.get(), ThrownItemRenderer::new);
            EntityRenderers.register(ModEntities.THROWING_KNIFE_ENTITY.get(), ThrownItemRenderer::new);
            EntityRenderers.register(ModEntities.POISON_DART_ENTITY.get(), ThrownItemRenderer::new);

            EntityRenderers.register(ModEntities.AGENT.get(), AgentRenderer::new);
            EntityRenderers.register(ModEntities.ARCH_AGENT.get(), ArchAgentRenderer::new);
            EntityRenderers.register(ModEntities.NINJA.get(), NinjaRenderer::new);
            EntityRenderers.register(ModEntities.JUNGLE_NINJA.get(), JungleNinjaRenderer::new);
            EntityRenderers.register(ModEntities.ODDJOB_ENTITY.get(), OddJobRenderer::new);
        }
    }
}
