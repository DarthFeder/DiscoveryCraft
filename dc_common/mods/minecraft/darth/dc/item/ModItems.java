package mods.minecraft.darth.dc.item;


import cpw.mods.fml.common.registry.GameRegistry;

import mods.minecraft.darth.dc.lib.BlockIDs;
import mods.minecraft.darth.dc.lib.ItemIDs;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems
{

    
    //Item Instances
    public static Item SciNotebook;
    public static Item UnknownDust;
    
    public static void init()
    {
        //Initialize each item
        SciNotebook = new ItemSciNotebook(ItemIDs.SCI_NOTEBOOK);
        UnknownDust = new ItemUnknownDust(ItemIDs.UNKNOWN_DUST);
        
        
        itemRecipiesInit();
    }
    
    public static void itemRecipiesInit()
    {
        GameRegistry.addSmelting(BlockIDs.UNKNOWN_ORE, new ItemStack(UnknownDust), 0F);
        
        
    }
    
}
