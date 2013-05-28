package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.ItemIDs;
import mods.minecraft.darth.dc.lib.Strings;

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
        unknownDust = new ItemDC(ItemIDs.UNKNOWN_DUST).setUnlocalizedName(Strings.UNKNOWN_DUST_NAME).setCreativeTab(DiscoveryCraft.tabDC).setMaxStackSize(64);
        monocleLens = new ItemDC(ItemIDs.MONOCLE_LENS).setUnlocalizedName(Strings.MONOCLE_LENS_NAME).setCreativeTab(DiscoveryCraft.tabDC).setMaxStackSize(64);
        notebookLock = new ItemDC(ItemIDs.NOTEBOOK_LOCK).setUnlocalizedName(Strings.NOTEBOOK_LOCK_NAME).setCreativeTab(DiscoveryCraft.tabDC).setMaxStackSize(64);
        sonicScrewdriver = new ItemSonicScrewdriver(ItemIDs.SONIC_SCREWDRIVER);
        
        
    }
    
    
}
