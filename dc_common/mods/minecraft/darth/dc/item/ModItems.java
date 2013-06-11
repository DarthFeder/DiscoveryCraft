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
    public static Item debugTool;
    public static Item craftingUpgrade;
    
    
    public static void init()
    {
        
        //Initialize each Regular Item
        sciNotebook = new ItemSciNotebook(ItemIDs.SCI_NOTEBOOK);
        unknownDust = new ItemDC(ItemIDs.UNKNOWN_DUST).setUnlocalizedName(Strings.UNKNOWN_DUST_NAME).setCreativeTab(DiscoveryCraft.tabDC).setMaxStackSize(64);
        sonicScrewdriver = new ItemSonicScrewdriver(ItemIDs.SONIC_SCREWDRIVER);
        debugTool = new ItemDebug(ItemIDs.DEBUG_TOOL);
        craftingUpgrade = new ItemCraftingUpgrade(ItemIDs.CRAFTING_UPGRADE);
        
        //Initialize each Crafting Ingredient Item
        notebookLock = new ItemCrafting(ItemIDs.NOTEBOOK_LOCK).setUnlocalizedName(Strings.NOTEBOOK_LOCK_NAME).setCreativeTab(DiscoveryCraft.tabDC);
        
        monocleLens = new ItemCrafting(ItemIDs.MONOCLE_LENS).setUnlocalizedName(Strings.MONOCLE_LENS_NAME).setCreativeTab(DiscoveryCraft.tabDC);
        
    }
    
    
}
