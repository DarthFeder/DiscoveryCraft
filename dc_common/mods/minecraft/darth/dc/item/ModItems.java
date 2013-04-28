package mods.minecraft.darth.dc.item;


import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import mods.minecraft.darth.dc.lib.BlockIDs;
import mods.minecraft.darth.dc.lib.ItemIDs;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems
{

    
    //Item Instances
    public static Item sciNotebook;
    public static Item unknownDust;
    
    public static void init()
    {
        //Initialize each item
        sciNotebook = new ItemSciNotebook(ItemIDs.SCI_NOTEBOOK);
        unknownDust = new ItemUnknownDust(ItemIDs.UNKNOWN_DUST);
        
        
        //Temp LanguageRegistry
        LanguageRegistry.addName(sciNotebook, "Science Notebook");
        LanguageRegistry.addName(unknownDust, "Unknown Dust");
        
        
        itemRecipiesInit();
    }
    
    public static void itemRecipiesInit()
    {
        //Unknown Dust
        GameRegistry.addSmelting(BlockIDs.UNKNOWN_ORE, new ItemStack(unknownDust), 0F);
        
        //Science Notebook
        GameRegistry.addShapelessRecipe(new ItemStack(sciNotebook), new ItemStack(Item.writableBook));
        
    }
    
}
