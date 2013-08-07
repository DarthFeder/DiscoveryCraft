package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.ItemIDs;
import mods.minecraft.darth.dc.lib.Strings;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;


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
    public static Item knifeThrowing;
    public static Item knifeMelee;
    public static Item unknownChunks;
    public static Item shovelFlint;
    public static Item pickaxeFlint;
    public static Item axeFlint;
    public static Item dirtPellet;
    public static Item rawGoron;
    public static Item goronIngot;
    public static Item scienceDye;
    public static Item specialShovelFlint;
    
    //Custom Enum Tool Materials
    public static EnumToolMaterial FLINT = EnumHelper.addToolMaterial("FLINT", 1, 50, 4.0F, 2F, 5);
    public static EnumToolMaterial BETTER_FLINT = EnumHelper.addToolMaterial("BETTER_FLINT", 1, 65, 4.5F, 2.5F, 2);
    public static EnumToolMaterial BLANK = EnumHelper.addToolMaterial("BLANK", -1, -1, -1F, -3, -1);
    public static EnumToolMaterial GORON = EnumHelper.addToolMaterial("GORON", 3, 400, 15.0F, 5, 20);
    
    
    public static void init()
    {
        
        //Initialize each Regular Item
        sciNotebook = new ItemSciNotebook(ItemIDs.SCI_NOTEBOOK);
        unknownDust = new ItemDC(ItemIDs.UNKNOWN_DUST).setUnlocalizedName(Strings.UNKNOWN_DUST_NAME).setCreativeTab(DiscoveryCraft.tabDC).setMaxStackSize(64);
        unknownChunks = new ItemDC(ItemIDs.UNKNOWN_CHUNKS).setUnlocalizedName(Strings.UNKNOWN_CHUNKS_NAME).setCreativeTab(DiscoveryCraft.tabDC).setMaxStackSize(64);
        sonicScrewdriver = new ItemSonicScrewdriver(ItemIDs.SONIC_SCREWDRIVER);
        debugTool = new ItemDebug(ItemIDs.DEBUG_TOOL);
        craftingUpgrade = new ItemCraftingUpgrade(ItemIDs.CRAFTING_UPGRADE);
        knifeThrowing = new ItemKnife(ItemIDs.KNIFE_THROWING, BLANK, false).setUnlocalizedName(Strings.KNIFE_THROWING_NAME);
        knifeMelee = new ItemKnife(ItemIDs.KNIFE_MELEE, FLINT, true).setUnlocalizedName(Strings.KNIFE_MELEE_NAME);;
        shovelFlint = new ShovelDC(ItemIDs.FLINT_SHOVEL, FLINT).setUnlocalizedName(Strings.FLINT_SHOVEL_NAME).setCreativeTab(DiscoveryCraft.tabDC);
        pickaxeFlint = new PickaxeDC(ItemIDs.FLINT_PICKAXE, FLINT).setUnlocalizedName(Strings.FLINT_PICKAXE_NAME).setCreativeTab(DiscoveryCraft.tabDC);
        axeFlint = new AxeDC(ItemIDs.FLINT_AXE, FLINT).setUnlocalizedName(Strings.FLINT_AXE_NAME).setCreativeTab(DiscoveryCraft.tabDC);
        rawGoron = new ItemDC(ItemIDs.RAW_GORON_ALLOY).setUnlocalizedName(Strings.RAW_GORON_ALLOY_NAME).setCreativeTab(DiscoveryCraft.tabDC).setMaxStackSize(64);
        goronIngot = new ItemDC(ItemIDs.GORON_ALLOY_INGOT).setUnlocalizedName(Strings.GORON_ALLOY_INGOT_NAME).setCreativeTab(DiscoveryCraft.tabDC).setMaxStackSize(64);
        specialShovelFlint = new ItemSpecialFlintShovel(ItemIDs.SPECIAL_FLINT_SHOVEL, BETTER_FLINT);
        
        //Initialize each Crafting Ingredient Item
        notebookLock = new ItemCrafting(ItemIDs.NOTEBOOK_LOCK).setUnlocalizedName(Strings.NOTEBOOK_LOCK_NAME);
        dirtPellet = new ItemCrafting(ItemIDs.DIRT_PELLET).setUnlocalizedName(Strings.DIRT_PELLET_NAME);
        monocleLens = new ItemCrafting(ItemIDs.MONOCLE_LENS).setUnlocalizedName(Strings.MONOCLE_LENS_NAME);
        scienceDye = new ItemCrafting(ItemIDs.SCIENCE_DYE).setUnlocalizedName(Strings.SCIENCE_DYE_NAME);
        
        registry();
    }
    
    
    private static void registry()
    {
        MinecraftForge.setToolClass(shovelFlint, "shovel", FLINT.getHarvestLevel());
        MinecraftForge.setToolClass(pickaxeFlint, "pickaxe", FLINT.getHarvestLevel());
        MinecraftForge.setToolClass(axeFlint, "axe", FLINT.getHarvestLevel());
        MinecraftForge.setToolClass(knifeMelee, "sword", FLINT.getHarvestLevel());
        MinecraftForge.setToolClass(specialShovelFlint, "shovel", FLINT.getHarvestLevel());
        
        OreDictionary.registerOre("ingotGoron", goronIngot);
        
        MinecraftForge.addGrassSeed(new ItemStack(dirtPellet), 4);
    }
    

}
