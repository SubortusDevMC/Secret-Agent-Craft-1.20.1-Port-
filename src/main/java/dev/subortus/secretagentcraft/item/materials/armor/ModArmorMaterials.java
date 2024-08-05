package dev.subortus.secretagentcraft.item.materials.armor;

import dev.subortus.secretagentcraft.SecretAgentMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    NOTHING("tuxedo", 1, new int[]{0,0,0,0}, 0,
            SoundEvents.ARMOR_EQUIP_LEATHER,0f,0f, ()-> Ingredient.of(Items.BLACK_WOOL)),
    LEATHERTUX("leather_tuxedo", 5, new int[]{1,2,3,1}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER,0f,0f, ()-> Ingredient.of(Items.LEATHER)),
    IRONTUX("iron_tuxedo", 15, new int[]{2,5,4,1}, 9,
            SoundEvents.ARMOR_EQUIP_LEATHER,0f,0f, ()-> Ingredient.of(Items.IRON_INGOT)),
    GOLDTUX("gold_tuxedo", 25, new int[]{2,5,3,1}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER,0f,0f, ()-> Ingredient.of(Items.GOLD_INGOT)),
    DIAMONDTUX("diamond_tuxedo", 10, new int[]{3,8,6,3}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER,2f,0f, ()-> Ingredient.of(Items.DIAMOND)),
    CHAINTUX("chain_tuxedo", 10, new int[]{2,5,4,1}, 12,
            SoundEvents.ARMOR_EQUIP_LEATHER,0f,0f, ()-> Ingredient.of(Items.IRON_INGOT)),
    MAC("mini_air_canister", 15, new int[]{0,0,0,0}, 1,
            SoundEvents.ARMOR_EQUIP_CHAIN,0f,0f, ()-> Ingredient.of(Items.IRON_INGOT)),
    NVG("night_vision_goggles", 15, new int[]{0,0,0,0}, 12,
    SoundEvents.ARMOR_EQUIP_LEATHER,0f,0f, ()-> Ingredient.of(Items.GLOWSTONE_DUST)),
    JETPACK("jetpack", 15, new int[]{0,0,0,0}, 0,
            SoundEvents.ARMOR_EQUIP_DIAMOND,0f,0f, ()-> Ingredient.of(Items.IRON_INGOT));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return SecretAgentMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}