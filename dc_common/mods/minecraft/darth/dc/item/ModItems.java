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
    public static Item sciNotebook;
    public static Item unknownDust;
    public static Item monocleLens;
    public static Item notebookLock;
    public static Item sonicScrewdriver;
    
    
    public static void init()
    {
        
        //Initialize each item
        sciNotebook = new ItemSciNotebook(ItemIDs.SCI_NOTEBOOK);
        unknownDust = new ItemUnknownDust(ItemIDs.UNKNOWN_DUST);
        monocleLens = new ItemMonocleLens(ItemIDs.MONOCLE_LENS);
        notebookLock = new ItemNotebookLock(ItemIDs.NOTEBOOK_LOCK);
        sonicScrewdriver = new ItemSonicScrewdriver(ItemIDs.SONIC_SCREWDRIVER);
        
        itemRecipiesInit();
        
    }
    
    private static void itemRecipiesInit()
    {
        //Unknown Dust
        GameRegistry.addSmelting(BlockIDs.UNKNOWN_ORE, new ItemStack(unknownDust), 0F);
        
        //Science Notebook
        GameRegistry.addRecipe(new ItemStack(sciNotebook), "dld", "lbl", "dnd", 'd', new ItemStack(unknownDust), 'b', new ItemStack(Item.writableBook), 'l', new ItemStack(Item.dyePowder), 'n', new ItemStack(notebookLock));
        
        //Monocle Lens
        GameRegistry.addRecipe(new ItemStack(monocleLens), "ggg", "gpg", "ggg", 'g', new ItemStack(Item.goldNugget), 'p', new ItemStack(Block.thinGlass));
    
        //Sonic Screwdriver
        GameRegistry.addRecipe(new ItemStack (sonicScrewdriver), "e  ", " s ", "  i", 'e', new ItemStack(Item.emerald), 's', new ItemStack(Item.stick), 'i', new ItemStack(Item.ingotIron));
    }
    
}
