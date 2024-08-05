package dev.subortus.secretagentcraft.item;

import dev.subortus.secretagentcraft.SecretAgentMod;
import dev.subortus.secretagentcraft.entity.ModEntities;
import dev.subortus.secretagentcraft.item.gadgets.ExplodingPenItem;
import dev.subortus.secretagentcraft.item.gadgets.JetpackController;
import dev.subortus.secretagentcraft.item.gadgets.SelfDestructorItem;
import dev.subortus.secretagentcraft.item.gadgets.armor.MiniAirCanisterItem;
import dev.subortus.secretagentcraft.item.gadgets.armor.NightVisionGoggleItem;
import dev.subortus.secretagentcraft.item.materials.armor.ModArmorMaterials;
import dev.subortus.secretagentcraft.item.weapons.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> MOD_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SecretAgentMod.MOD_ID);

    //Armors
    public static final RegistryObject<Item> BOWLER_HAT = MOD_ITEMS.register("bowler_hat",
    () -> new ArmorItem(ModArmorMaterials.NOTHING, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TUXEDO = MOD_ITEMS.register("tuxedo",
            () -> new ArmorItem(ModArmorMaterials.NOTHING, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TUXEDO_PANTS = MOD_ITEMS.register("tuxedo_pants",
            () -> new ArmorItem(ModArmorMaterials.NOTHING, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TUXEDO_SHOES = MOD_ITEMS.register("tuxedo_shoes",
            () -> new ArmorItem(ModArmorMaterials.NOTHING, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> T1_BOWLER_HAT = MOD_ITEMS.register("leather_bowler_hat",
            () -> new ArmorItem(ModArmorMaterials.LEATHERTUX, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T1_TUXEDO = MOD_ITEMS.register("leather_tuxedo",
            () -> new ArmorItem(ModArmorMaterials.LEATHERTUX, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T1_TUXEDO_PANTS = MOD_ITEMS.register("leather_tuxedo_pants",
            () -> new ArmorItem(ModArmorMaterials.LEATHERTUX, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T1_TUXEDO_SHOES = MOD_ITEMS.register("leather_tuxedo_shoes",
            () -> new ArmorItem(ModArmorMaterials.LEATHERTUX, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> T2_BOWLER_HAT = MOD_ITEMS.register("chain_bowler_hat",
            () -> new ArmorItem(ModArmorMaterials.CHAINTUX, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T2_TUXEDO = MOD_ITEMS.register("chain_tuxedo",
            () -> new ArmorItem(ModArmorMaterials.CHAINTUX, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T2_TUXEDO_PANTS = MOD_ITEMS.register("chain_tuxedo_pants",
            () -> new ArmorItem(ModArmorMaterials.CHAINTUX, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T2_TUXEDO_SHOES = MOD_ITEMS.register("chain_tuxedo_shoes",
            () -> new ArmorItem(ModArmorMaterials.CHAINTUX, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> T3_BOWLER_HAT = MOD_ITEMS.register("gold_bowler_hat",
            () -> new ArmorItem(ModArmorMaterials.GOLDTUX, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T3_TUXEDO = MOD_ITEMS.register("gold_tuxedo",
            () -> new ArmorItem(ModArmorMaterials.GOLDTUX, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T3_TUXEDO_PANTS = MOD_ITEMS.register("gold_tuxedo_pants",
            () -> new ArmorItem(ModArmorMaterials.GOLDTUX, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T3_TUXEDO_SHOES = MOD_ITEMS.register("gold_tuxedo_shoes",
            () -> new ArmorItem(ModArmorMaterials.GOLDTUX, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> T4_BOWLER_HAT = MOD_ITEMS.register("iron_bowler_hat",
            () -> new ArmorItem(ModArmorMaterials.IRONTUX, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T4_TUXEDO = MOD_ITEMS.register("iron_tuxedo",
            () -> new ArmorItem(ModArmorMaterials.IRONTUX, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T4_TUXEDO_PANTS = MOD_ITEMS.register("iron_tuxedo_pants",
            () -> new ArmorItem(ModArmorMaterials.IRONTUX, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T4_TUXEDO_SHOES = MOD_ITEMS.register("iron_tuxedo_shoes",
            () -> new ArmorItem(ModArmorMaterials.IRONTUX, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> T5_BOWLER_HAT = MOD_ITEMS.register("diamond_bowler_hat",
            () -> new ArmorItem(ModArmorMaterials.DIAMONDTUX, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T5_TUXEDO = MOD_ITEMS.register("diamond_tuxedo",
            () -> new ArmorItem(ModArmorMaterials.DIAMONDTUX, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T5_TUXEDO_PANTS = MOD_ITEMS.register("diamond_tuxedo_pants",
            () -> new ArmorItem(ModArmorMaterials.DIAMONDTUX, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> T5_TUXEDO_SHOES = MOD_ITEMS.register("diamond_tuxedo_shoes",
            () -> new ArmorItem(ModArmorMaterials.DIAMONDTUX, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));

    // Gadgets <-- Hehe the original author did this too :D
    public static final RegistryObject<Item> MINI_AIR_CANISTER = MOD_ITEMS.register("mini_air_canister",
            () -> new MiniAirCanisterItem(ModArmorMaterials.MAC, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SELF_DESTRUCTOR = MOD_ITEMS.register("self_destructor",
            () -> new SelfDestructorItem(new Item.Properties().defaultDurability(1)));

    public static final RegistryObject<Item> NIGHT_VISION_GOGGLES = MOD_ITEMS.register("night_vision_goggles",
            () -> new NightVisionGoggleItem(ModArmorMaterials.NVG, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> EXPLODING_PEN = MOD_ITEMS.register("exploding_pen",
            () -> new ExplodingPenItem(new Item.Properties().durability(1)));

    public static final RegistryObject<Item> JETPACK = MOD_ITEMS.register("jetpack",
            () -> new ArmorItem(ModArmorMaterials.JETPACK, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> JETPACK_CONTROL = MOD_ITEMS.register("jetpack_control",
            () -> new JetpackController(new Item.Properties().stacksTo(1)));


    // Materials, Ammo, MISC
    public static final RegistryObject<Item> BULLET = MOD_ITEMS.register("bullet",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GUN_GRIP = MOD_ITEMS.register("gun_grip",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GUN_BARREL = MOD_ITEMS.register("gun_barrel",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GUN_HAMMER = MOD_ITEMS.register("gun_hammer",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_BULLET = MOD_ITEMS.register("golden_bullet",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_GUN_GRIP = MOD_ITEMS.register("golden_gun_grip",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_GUN_BARREL = MOD_ITEMS.register("golden_gun_barrel",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_GUN_HAMMER = MOD_ITEMS.register("golden_gun_hammer",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> APPLE_SEEDS = MOD_ITEMS.register("apple_seeds",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CYANIDE = MOD_ITEMS.register("cyanide",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().effect(
                            new MobEffectInstance(MobEffects.WITHER, 1000, 10, true, true, true),1.0f)
                            .build())
            ));
    public static final RegistryObject<Item> POISON_DART = MOD_ITEMS.register("poison_dart",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROCKET_FUEL = MOD_ITEMS.register("rocket_fuel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SMALL_ROCKET_ENGINE = MOD_ITEMS.register("small_rocket_engine",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_ROCKET_ENGINE = MOD_ITEMS.register("large_rocket_engine",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_DUST = MOD_ITEMS.register("iron_dust",
            ()-> new Item(new Item.Properties()));

    // Guns and Weapons

    public static final RegistryObject<Item> HAND_GUN = MOD_ITEMS.register("hand_gun",
            ()-> new HandGunItem(new Item.Properties().defaultDurability(384)));
    public static final RegistryObject<Item> BLOW_GUN = MOD_ITEMS.register("blow_gun",
            ()-> new BlowGunItem(new Item.Properties().defaultDurability(384)));
    public static final RegistryObject<Item> GOLDEN_GUN = MOD_ITEMS.register("golden_gun",
            ()-> new GoldenGunItem(new Item.Properties().defaultDurability(100)));

    public static final RegistryObject<Item> THROWABLE_HAT = MOD_ITEMS.register("throwable_hat",
            () -> new ThrowableHatItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> THROWING_KNIFE = MOD_ITEMS.register("throwing_knife",
            () -> new ThrowingKnifeItem(new Item.Properties()));

    public static final RegistryObject<Item> IRON_KNUCKLES = MOD_ITEMS.register("iron_knuckles",
            ()-> new SwordItem(Tiers.IRON, 3, -1,new Item.Properties().defaultDurability(384))); // Didn't know durability so put 384 as compromise.

    // Spawn Eggs

    public static final RegistryObject<Item> AGENT_SPAWN_EGG = MOD_ITEMS.register("agent_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.AGENT,0x141414,0x7f0000,new Item.Properties()));
    public static final RegistryObject<Item> ARCH_AGENT_SPAWN_EGG = MOD_ITEMS.register("arch_agent_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.ARCH_AGENT,0xFFFFFF,0x7c6940,new Item.Properties()));
    public static final RegistryObject<Item> NINJA_SPAWN_EGG = MOD_ITEMS.register("ninja_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.NINJA,0x141414,0x000000,new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_NINJA_SPAWN_EGG = MOD_ITEMS.register("jungle_ninja_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.JUNGLE_NINJA,0x141414,0x00af14,new Item.Properties()));
    public static final RegistryObject<Item> ODD_JOB_SPAWN_EGG = MOD_ITEMS.register("odd_job_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.ODDJOB_ENTITY,0xa56143,0x141414,new Item.Properties()));

    public static void register(IEventBus eventBus){
        MOD_ITEMS.register(eventBus);
    }
}
