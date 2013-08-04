package mods.minecraft.darth.dc.recipe;

import mods.minecraft.darth.dc.item.ModItems;
import mods.minecraft.darth.dc.lib.BlockIDs;
import mods.minecraft.darth.dc.lib.ItemIDs;

import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

public class SmeltingRecipes
{
    
    public static void init()
    {
        
        //Unknown Dust
        GameRegistry.addSmelting(BlockIDs.UNKNOWN_ORE, new ItemStack(ModItems.unknownDust), 3F);
        
        //Goron Alloy
        GameRegistry.addSmelting(ItemIDs.RAW_GORON_ALLOY, new ItemStack(ModItems.goronIngot), 0.4F);
        
    }

}
