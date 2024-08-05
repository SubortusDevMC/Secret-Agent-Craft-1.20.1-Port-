package dev.subortus.secretagentcraft.datagen.recipe;

import dev.subortus.secretagentcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // T0 Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BOWLER_HAT.get())
                .pattern("WWW")
                .pattern("W W") // This is what the crafting table sees.
                .pattern("   ")
                .define('W', Items.BLACK_WOOL) // This is what tells the json creator what everything means.
                .unlockedBy(getHasName(Items.BLACK_WOOL), has(Items.BLACK_WOOL)) // Self-explanatory.
                .save(pWriter); // Saves it to the Consumer to be created.
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TUXEDO.get())
                .pattern("W W")
                .pattern("WWW")
                .pattern("WWW")
                .define('W', Items.BLACK_WOOL)
                .unlockedBy(getHasName(Items.BLACK_WOOL), has(Items.BLACK_WOOL))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TUXEDO_PANTS.get())
                .pattern("WWW")
                .pattern("W W")
                .pattern("W W")
                .define('W', Items.BLACK_WOOL)
                .unlockedBy(getHasName(Items.BLACK_WOOL), has(Items.BLACK_WOOL))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TUXEDO_SHOES.get())
                .pattern("L L")
                .pattern("   ")
                .pattern("   ")
                .define('L', Items.LEATHER)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .save(pWriter);
        // T1 Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T1_BOWLER_HAT.get())
                .pattern("WWW")
                .pattern("WXW")
                .pattern("   ")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.LEATHER_HELMET)
                .unlockedBy(getHasName(Items.LEATHER_HELMET), has(Items.LEATHER_HELMET))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T1_TUXEDO.get())
                .pattern("WXW")
                .pattern("WWW")
                .pattern("WWW")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.LEATHER_CHESTPLATE)
                .unlockedBy(getHasName(Items.LEATHER_CHESTPLATE), has(Items.LEATHER_CHESTPLATE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T1_TUXEDO_PANTS.get())
                .pattern("WWW")
                .pattern("WXW")
                .pattern("W W")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.LEATHER_LEGGINGS)
                .unlockedBy(getHasName(Items.LEATHER_LEGGINGS), has(Items.LEATHER_LEGGINGS))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T1_TUXEDO_SHOES.get())
                .pattern("LXL")
                .pattern("   ")
                .pattern("   ")
                .define('L', Items.LEATHER)
                .define('X', Items.LEATHER_BOOTS)
                .unlockedBy(getHasName(Items.LEATHER_BOOTS), has(Items.LEATHER_BOOTS))
                .save(pWriter);
        // T2 Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T2_BOWLER_HAT.get())
                .pattern("WWW")
                .pattern("WXW")
                .pattern("   ")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.CHAINMAIL_HELMET)
                .unlockedBy(getHasName(Items.CHAINMAIL_HELMET), has(Items.CHAINMAIL_HELMET))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T2_TUXEDO.get())
                .pattern("WXW")
                .pattern("WWW")
                .pattern("WWW")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.CHAINMAIL_CHESTPLATE)
                .unlockedBy(getHasName(Items.CHAINMAIL_CHESTPLATE), has(Items.CHAINMAIL_CHESTPLATE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T2_TUXEDO_PANTS.get())
                .pattern("WWW")
                .pattern("WXW")
                .pattern("W W")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.CHAINMAIL_LEGGINGS)
                .unlockedBy(getHasName(Items.CHAINMAIL_LEGGINGS), has(Items.CHAINMAIL_LEGGINGS))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T2_TUXEDO_SHOES.get())
                .pattern("LXL")
                .pattern("   ")
                .pattern("   ")
                .define('L', Items.LEATHER)
                .define('X', Items.CHAINMAIL_BOOTS)
                .unlockedBy(getHasName(Items.CHAINMAIL_BOOTS), has(Items.CHAINMAIL_BOOTS))
                .save(pWriter);
        // T3 Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T3_BOWLER_HAT.get())
                .pattern("WWW")
                .pattern("WXW")
                .pattern("   ")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.GOLDEN_HELMET)
                .unlockedBy(getHasName(Items.GOLDEN_HELMET), has(Items.GOLDEN_HELMET))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T3_TUXEDO.get())
                .pattern("WXW")
                .pattern("WWW")
                .pattern("WWW")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.GOLDEN_CHESTPLATE)
                .unlockedBy(getHasName(Items.GOLDEN_CHESTPLATE), has(Items.GOLDEN_CHESTPLATE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T3_TUXEDO_PANTS.get())
                .pattern("WWW")
                .pattern("WXW")
                .pattern("W W")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.GOLDEN_LEGGINGS)
                .unlockedBy(getHasName(Items.GOLDEN_LEGGINGS), has(Items.GOLDEN_LEGGINGS))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T3_TUXEDO_SHOES.get())
                .pattern("LXL")
                .pattern("   ")
                .pattern("   ")
                .define('L', Items.LEATHER)
                .define('X', Items.GOLDEN_BOOTS)
                .unlockedBy(getHasName(Items.GOLDEN_BOOTS), has(Items.GOLDEN_BOOTS))
                .save(pWriter);
        // T4 Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T4_BOWLER_HAT.get())
                .pattern("WWW")
                .pattern("WXW")
                .pattern("   ")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.IRON_HELMET)
                .unlockedBy(getHasName(Items.IRON_HELMET), has(Items.IRON_HELMET))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T4_TUXEDO.get())
                .pattern("WXW")
                .pattern("WWW")
                .pattern("WWW")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.IRON_CHESTPLATE)
                .unlockedBy(getHasName(Items.IRON_CHESTPLATE), has(Items.IRON_CHESTPLATE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T4_TUXEDO_PANTS.get())
                .pattern("WWW")
                .pattern("WXW")
                .pattern("W W")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.IRON_LEGGINGS)
                .unlockedBy(getHasName(Items.IRON_LEGGINGS), has(Items.IRON_LEGGINGS))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T4_TUXEDO_SHOES.get())
                .pattern("LXL")
                .pattern("   ")
                .pattern("   ")
                .define('L', Items.LEATHER)
                .define('X', Items.IRON_BOOTS)
                .unlockedBy(getHasName(Items.IRON_BOOTS), has(Items.IRON_BOOTS))
                .save(pWriter);
        // T5 Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T5_BOWLER_HAT.get())
                .pattern("WWW")
                .pattern("WXW")
                .pattern("   ")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.DIAMOND_HELMET)
                .unlockedBy(getHasName(Items.DIAMOND_HELMET), has(Items.DIAMOND_HELMET))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T5_TUXEDO.get())
                .pattern("WXW")
                .pattern("WWW")
                .pattern("WWW")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.DIAMOND_CHESTPLATE)
                .unlockedBy(getHasName(Items.DIAMOND_CHESTPLATE), has(Items.DIAMOND_CHESTPLATE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T5_TUXEDO_PANTS.get())
                .pattern("WWW")
                .pattern("WXW")
                .pattern("W W")
                .define('W', Items.BLACK_WOOL)
                .define('X', Items.DIAMOND_LEGGINGS)
                .unlockedBy(getHasName(Items.DIAMOND_LEGGINGS), has(Items.DIAMOND_LEGGINGS))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.T5_TUXEDO_SHOES.get())
                .pattern("LXL")
                .pattern("   ")
                .pattern("   ")
                .define('L', Items.LEATHER)
                .define('X', Items.DIAMOND_BOOTS)
                .unlockedBy(getHasName(Items.DIAMOND_BOOTS), has(Items.DIAMOND_BOOTS))
                .save(pWriter);

        // RESPIRATOR THING
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MINI_AIR_CANISTER.get())
                .pattern(" X ")
                .pattern("X X")
                .pattern("   ")
                .define('X', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        //SELF DESTRUCTOR
        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.SELF_DESTRUCTOR.get(), 1)
                .requires(Items.IRON_INGOT)
                .requires(Items.REDSTONE)
                .requires(Items.TNT)
                .unlockedBy(getHasName(Items.TNT), has(Items.TNT))
                .save(pWriter);

        // NIGHT VISION GOGGLES
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.NIGHT_VISION_GOGGLES.get())
                .pattern("XXX")
                .pattern("G G")
                .pattern("P P")
                .define('X', Items.IRON_INGOT)
                .define('G', Items.GLOWSTONE_DUST)
                .define('P', Items.GLASS_PANE)
                .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST))
                .save(pWriter);

        //EXPLODING PEN
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EXPLODING_PEN.get())
                .pattern(" R ")
                .pattern(" G ")
                .pattern(" I ")
                .define('R', Items.REDSTONE)
                .define('G', Items.GUNPOWDER)
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.GUNPOWDER), has(Items.GUNPOWDER))
                .save(pWriter);

        //BULLET
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BULLET.get())
                .pattern("IG ")
                .pattern("   ")
                .pattern("   ")
                .define('I', Items.IRON_INGOT)
                .define('G', Items.GUNPOWDER)
                .unlockedBy(getHasName(Items.GUNPOWDER), has(Items.GUNPOWDER))
                .save(pWriter);
        //GUN GRIP
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.GUN_GRIP.get())
                .pattern("II ")
                .pattern("   ")
                .pattern("   ")
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);
        //GUN BARREL
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.GUN_BARREL.get())
                .pattern("III")
                .pattern("   ")
                .pattern("   ")
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);
        //GUN HAMMER
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.GUN_HAMMER.get())
                .pattern("FI ")
                .pattern("   ")
                .pattern("   ")
                .define('I', Items.IRON_INGOT)
                .define('F', Items.FLINT)
                .unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
                .save(pWriter);
        //GOLDEN BULLET
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.GOLDEN_BULLET.get())
                .pattern("IG ")
                .pattern("   ")
                .pattern("   ")
                .define('I', Items.GOLD_INGOT)
                .define('G', Items.GUNPOWDER)
                .unlockedBy(getHasName(Items.GUNPOWDER), has(Items.GUNPOWDER))
                .save(pWriter);
        //GOLDEN GUN GRIP
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.GOLDEN_GUN_GRIP.get())
                .pattern("GG ")
                .pattern("   ")
                .pattern("   ")
                .define('G', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);
        //GOLDEN GUN BARREL
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.GOLDEN_GUN_BARREL.get())
                .pattern("GGG")
                .pattern("   ")
                .pattern("   ")
                .define('G', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);
        //GOLDEN HAMMER
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.GOLDEN_GUN_HAMMER.get())
                .pattern("FG ")
                .pattern("   ")
                .pattern("   ")
                .define('G', Items.GOLD_INGOT)
                .define('F', Items.FLINT)
                .unlockedBy(getHasName(Items.FLINT), has(Items.FLINT))
                .save(pWriter);
        //APPLE SEEDS
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BREWING, ModItems.APPLE_SEEDS.get(), 1)
                .requires(Items.APPLE)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .save(pWriter);
        //CYANIDE (Ooooooh sca-r-r-r-y)
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BREWING, ModItems.CYANIDE.get(), 1)
                .requires(ModItems.APPLE_SEEDS.get())
                .unlockedBy(getHasName(ModItems.APPLE_SEEDS.get()), has(ModItems.APPLE_SEEDS.get()))
                .save(pWriter);
        //POISON DART
        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.POISON_DART.get(), 1)
                .requires(Items.IRON_INGOT)
                .requires(Items.FEATHER)
                .requires(ModItems.CYANIDE.get())
                .unlockedBy(getHasName(Items.FEATHER), has(Items.FEATHER))
                .save(pWriter);
        //LARGE ROCKET ENGINE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LARGE_ROCKET_ENGINE.get())
                .pattern(" I ")
                .pattern("IRI")
                .pattern("IFI")
                .define('I', Items.IRON_INGOT)
                .define('R', Items.REDSTONE)
                .define('F', Items.FLINT_AND_STEEL)
                .unlockedBy(getHasName(Items.FLINT_AND_STEEL), has(Items.FLINT_AND_STEEL))
                .save(pWriter);
        //SMALL ROCKET ENGINE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SMALL_ROCKET_ENGINE.get(), 1)
                .requires(Items.IRON_INGOT)
                .requires(Items.IRON_INGOT)
                .requires(Items.FLINT_AND_STEEL)
                .unlockedBy(getHasName(Items.FLINT_AND_STEEL), has(Items.FLINT_AND_STEEL))
                .save(pWriter);
        //IRON DUST
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IRON_DUST.get(), 9)
                .requires(Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);
        //ROCKET FUEL
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROCKET_FUEL.get(), 1)
                .requires(Items.COAL)
                .requires(ModItems.IRON_DUST.get())
                .requires(Items.GUNPOWDER)
                .unlockedBy(getHasName(ModItems.IRON_DUST.get()), has(ModItems.IRON_DUST.get()))
                .save(pWriter);
        //JETPACK
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.JETPACK.get())
                .pattern("   ")
                .pattern("SLS")
                .pattern("   ")
                .define('L', ModItems.LARGE_ROCKET_ENGINE.get())
                .define('S', ModItems.SMALL_ROCKET_ENGINE.get())
                .unlockedBy(getHasName(ModItems.LARGE_ROCKET_ENGINE.get()), has(ModItems.LARGE_ROCKET_ENGINE.get()))
                .save(pWriter);
        //JETPACK CONTROLLER
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JETPACK_CONTROL.get(), 1)
                .requires(Items.IRON_INGOT)
                .requires(Items.REDSTONE)
                .requires(Items.REDSTONE)
                .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                .save(pWriter);
        //HAND GUN
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HAND_GUN.get())
                .pattern("BH ")
                .pattern("  G")
                .pattern("   ")
                .define('B', ModItems.GUN_BARREL.get())
                .define('H', ModItems.GUN_HAMMER.get())
                .define('G', ModItems.GUN_GRIP.get())
                .unlockedBy(getHasName(ModItems.GUN_BARREL.get()), has(ModItems.GUN_BARREL.get()))
                .save(pWriter);
        //GOLDEN GUN
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLDEN_GUN.get())
                .pattern("BH ")
                .pattern("  G")
                .pattern("   ")
                .define('B', ModItems.GOLDEN_GUN_BARREL.get())
                .define('H', ModItems.GOLDEN_GUN_HAMMER.get())
                .define('G', ModItems.GOLDEN_GUN_GRIP.get())
                .unlockedBy(getHasName(ModItems.GOLDEN_GUN_BARREL.get()), has(ModItems.GOLDEN_GUN_BARREL.get()))
                .save(pWriter);
        //THROWABLE HAT
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THROWABLE_HAT.get())
                .pattern("III")
                .pattern("W W")
                .pattern("   ")
                .define('I', Items.IRON_INGOT)
                .define('W', Items.BLACK_WOOL)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);
        //IRON KNUCKLES
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_KNUCKLES.get())
                .pattern("III")
                .pattern(" I ")
                .pattern("   ")
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);
        //THROWING KNIFE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THROWING_KNIFE.get())
                .pattern("I  ")
                .pattern(" S ")
                .pattern("   ")
                .define('I', Items.IRON_INGOT)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);
    }


}
