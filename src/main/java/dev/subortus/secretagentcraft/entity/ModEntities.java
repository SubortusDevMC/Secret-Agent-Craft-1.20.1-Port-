package dev.subortus.secretagentcraft.entity;

import dev.subortus.secretagentcraft.SecretAgentMod;
import dev.subortus.secretagentcraft.entity.mobs.server.*;
import dev.subortus.secretagentcraft.entity.projectiles.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SecretAgentMod.MOD_ID);

    public static final RegistryObject<EntityType<BulletEntity>> BULLET_PROJECTILE =
            ENTITY_TYPES.register("bullet_entity",
                    () -> EntityType.Builder.<BulletEntity>of(BulletEntity::new, MobCategory.MISC)
                            .sized(0.5f,0.5f).build("bullet_entity"));
    public static final RegistryObject<EntityType<GoldenBulletEntity>> GOLDEN_BULLET_PROJECTILE =
            ENTITY_TYPES.register("golden_bullet_entity",
                    () -> EntityType.Builder.<GoldenBulletEntity>of(GoldenBulletEntity::new, MobCategory.MISC)
                            .sized(0.5f,0.5f).build("golden_bullet_entity"));
    public static final RegistryObject<EntityType<ThrowableHatEntity>> THROWABLE_HAT_PROJECTILE =
            ENTITY_TYPES.register("throwable_hat_entity",
                    () -> EntityType.Builder.<ThrowableHatEntity>of(ThrowableHatEntity::new, MobCategory.MISC)
                            .sized(0.5f,0.5f).build("throwable_hat_entity"));
    public static final RegistryObject<EntityType<OddJobHatEntity>> ODDJOB_HAT_PROJECTILE =
            ENTITY_TYPES.register("oddjob_hat_entity",
                    () -> EntityType.Builder.<OddJobHatEntity>of(OddJobHatEntity::new, MobCategory.MISC)
                            .sized(0.5f,0.5f).build("oddjob_hat_entity"));
    public static final RegistryObject<EntityType<ThrowingKnifeEntity>> THROWING_KNIFE_ENTITY =
            ENTITY_TYPES.register("throwing_knife_entity",
                    () -> EntityType.Builder.<ThrowingKnifeEntity>of(ThrowingKnifeEntity::new, MobCategory.MISC)
                            .sized(0.5f,0.5f).build("throwing_knife_entity"));
    public static final RegistryObject<EntityType<PoisonDartEntity>> POISON_DART_ENTITY =
            ENTITY_TYPES.register("poison_dart_entity",
                    () -> EntityType.Builder.<PoisonDartEntity>of(PoisonDartEntity::new, MobCategory.MISC)
                            .sized(0.5f,0.5f).build("poison_dart_entity"));

    public static final RegistryObject<EntityType<AgentEntity>> AGENT =
            ENTITY_TYPES.register("agent", () -> EntityType.Builder.of(AgentEntity::new, MobCategory.MONSTER)
                    .sized(0.5f,2.0f).build("agent"));

    public static final RegistryObject<EntityType<ArchAgentEntity>> ARCH_AGENT =
            ENTITY_TYPES.register("arch_agent", () -> EntityType.Builder.of(ArchAgentEntity::new, MobCategory.MONSTER)
                    .sized(0.5f,2.0f).build("arch_agent"));

    public static final RegistryObject<EntityType<NinjaEntity>> NINJA =
            ENTITY_TYPES.register("ninja", () -> EntityType.Builder.of(NinjaEntity::new, MobCategory.MONSTER)
                    .sized(0.5f,2.0f).build("ninja"));

    public static final RegistryObject<EntityType<JungleNinjaEntity>> JUNGLE_NINJA =
            ENTITY_TYPES.register("jungle_ninja", () -> EntityType.Builder.of(JungleNinjaEntity::new, MobCategory.MONSTER)
                    .sized(0.5f,2.0f).build("jungle_ninja"));

    public static final RegistryObject<EntityType<OddJobEntity>> ODDJOB_ENTITY =
            ENTITY_TYPES.register("oddjob", () -> EntityType.Builder.of(OddJobEntity::new, MobCategory.MONSTER)
                    .sized(0.5f,2.0f).build("oddjob"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
