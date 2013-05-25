package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.lib.ItemIDs;

import net.minecraft.item.Item;


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
        
        
    }
    
    
}
