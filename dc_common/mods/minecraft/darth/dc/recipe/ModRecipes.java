package mods.minecraft.darth.dc.recipe;

import java.util.logging.Level;

import mods.minecraft.darth.dc.core.util.LogUtil;
import mods.minecraft.darth.dc.lib.Strings;

public class ModRecipes
{

    public static void init()
    {
        
        //Initialize Crafting Recipes
        CraftingRecipes.init();
        
        //Initialize Smelting (Furnace) Recipes
        SmeltingRecipes.init();
        
        //Log Completion
        LogUtil.log(Level.INFO, Strings.RECIPE_INIT_SUCCESS);
    }
    
}
