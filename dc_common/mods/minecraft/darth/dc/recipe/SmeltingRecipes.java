package mods.minecraft.darth.dc.recipe;

import mods.minecraft.darth.dc.item.ModItems;
import mods.minecraft.darth.dc.lib.BlockIDs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class SmeltingRecipes
{
    
    public static void init()
    {
        
        //Unknown Dust
        GameRegistry.addSmelting(BlockIDs.UNKNOWN_ORE, new ItemStack(ModItems.unknownDust), 0F);
        
    }

}
