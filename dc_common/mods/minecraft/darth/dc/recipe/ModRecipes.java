package mods.minecraft.darth.dc.recipe;

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
        LogUtil.info(Strings.RECIPE_INIT_SUCCESS);
    }
    
}
