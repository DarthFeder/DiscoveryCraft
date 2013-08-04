package mods.minecraft.darth.dc.core.util;

import java.util.ArrayList;

import mods.minecraft.darth.dc.core.util.LogUtil;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;

import net.minecraftforge.oredict.ShapedOreRecipe;

public class RecipeUtil
{
    /**
     * Adds a recipe, supports ore dictionary
     * @param output
     * @param input
     */
    @SuppressWarnings("unchecked")
    public static void addOreRecipe(ItemStack output, Object[] input) 
    {
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(output, new Object[] { Boolean.valueOf(true), input }));
    }
    
    @SuppressWarnings("rawtypes")
    public static void RemoveRecipe(ItemStack resultItem) //Code by yope_fried inspired by pigalot
    {
        ItemStack recipeResult = null;
        ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();

        for (int scan = 0; scan < recipes.size(); scan++)
        {
            IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
            if (tmpRecipe instanceof ShapedRecipes)
            {
                ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }

            if (tmpRecipe instanceof ShapelessRecipes)
            {
                ShapelessRecipes recipe = (ShapelessRecipes)tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }

            if (ItemStack.areItemStacksEqual(resultItem, recipeResult))
            {
                LogUtil.info("Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }
        }
    }
}
