package mods.minecraft.darth.dc.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.FMLLog;

import mods.minecraft.darth.dc.lib.BlockIDs;
import mods.minecraft.darth.dc.lib.ItemIDs;
import mods.minecraft.darth.dc.lib.Reference;
import mods.minecraft.darth.dc.lib.Strings;


public class ConfigHandler
{

    public static Configuration configuration;
    
    
    
    public static void init(File configFile)
    {
        
        configuration = new Configuration(configFile);
        
        try
        {
            configuration.load();
        
            //Block Ids
            BlockIDs.UNKNOWN_ORE = configuration.getBlock(Strings.UNKNOWN_ORE_NAME, BlockIDs.UNKNOWN_ORE_DEFAULT).getInt(BlockIDs.UNKNOWN_ORE_DEFAULT);
            BlockIDs.GLOWING_UNKNOWN_ORE = configuration.getBlock(Strings.GLOWING_UNKNOWN_ORE_NAME, BlockIDs.GLOWING_UNKNOWN_ORE_DEFAULT).getInt(BlockIDs.GLOWING_UNKNOWN_ORE_DEFAULT);
            BlockIDs.SCIENTIFIC_ASSEMBLER = configuration.getBlock(Strings.SCIENTIFIC_ASSEMBLER_NAME, BlockIDs.SCIENTIFIC_ASSEMBLER_DEFAULT).getInt(BlockIDs.SCIENTIFIC_ASSEMBLER_DEFAULT);
        
            //Item Ids
            ItemIDs.SCI_NOTEBOOK = configuration.getItem(Strings.SCI_NOTEBOOK_NAME, ItemIDs.SCI_NOTEBOOK_DEFAULT).getInt(ItemIDs.SCI_NOTEBOOK_DEFAULT);
            ItemIDs.UNKNOWN_DUST = configuration.getItem(Strings.UNKNOWN_DUST_NAME, ItemIDs.UNKNOWN_DUST_DEFAULT).getInt(ItemIDs.UNKNOWN_DUST_DEFAULT);
            ItemIDs.MONOCLE_LENS = configuration.getItem(Strings.MONOCLE_LENS_NAME, ItemIDs.MONOCLE_LENS_DEFAULT).getInt(ItemIDs.MONOCLE_LENS_DEFAULT);
            ItemIDs.NOTEBOOK_LOCK = configuration.getItem(Strings.NOTEBOOK_LOCK_NAME, ItemIDs.NOTEBOOK_LOCK_DEFAULT).getInt(ItemIDs.NOTEBOOK_LOCK_DEFAULT) ;
            ItemIDs.SONIC_SCREWDRIVER = configuration.getItem(Strings.SONIC_SCREWDRIVER_NAME, ItemIDs.SONIC_SCREWDRIVER_DEFAULT).getInt(ItemIDs.SONIC_SCREWDRIVER_DEFAULT);
            ItemIDs.DEBUG_TOOL = configuration.getItem(Strings.DEBUG_TOOL_NAME, ItemIDs.DEBUG_TOOL_DEFAULT).getInt(ItemIDs.DEBUG_TOOL_DEFAULT);
            ItemIDs.CRAFTING_UPGRADE = configuration.getItem(Strings.CRAFTING_UPGRADE_NAME, ItemIDs.CRAFTING_UPGRADE_DEFAULT).getInt(ItemIDs.CRAFTING_UPGRADE_DEFAULT);
            ItemIDs.KNIFE_THROWING = configuration.getItem(Strings.KNIFE_THROWING_NAME, ItemIDs.KNIFE_THROWING_DEFAULT).getInt(ItemIDs.KNIFE_THROWING_DEFAULT);
            ItemIDs.KNIFE_MELEE = configuration.getItem(Strings.KNIFE_MELEE_NAME, ItemIDs.KNIFE_MELEE_DEFAULT).getInt(ItemIDs.KNIFE_MELEE_DEFAULT);
            ItemIDs.FLINT_SHOVEL = configuration.getItem(Strings.FLINT_SHOVEL_NAME, ItemIDs.FLINT_SHOVEL_DEFULT).getInt(ItemIDs.FLINT_SHOVEL_DEFULT);
            ItemIDs.FLINT_PICKAXE = configuration.getItem(Strings.FLINT_PICKAXE_NAME, ItemIDs.FLINT_PICKAXE_DEFULT).getInt(ItemIDs.FLINT_PICKAXE_DEFULT);
            ItemIDs.FLINT_AXE = configuration.getItem(Strings.FLINT_AXE_NAME, ItemIDs.FLINT_AXE_DEFULT).getInt(ItemIDs.FLINT_AXE_DEFULT);
            ItemIDs.DIRT_PELLET = configuration.getItem(Strings.DIRT_PELLET_NAME, ItemIDs.DIRT_PELLET_DEFAULT).getInt(ItemIDs.DIRT_PELLET_DEFAULT);
            ItemIDs.UNKNOWN_CHUNKS = configuration.getItem(Strings.UNKNOWN_CHUNKS_NAME, ItemIDs.UNKNOWN_DUST_DEFAULT).getInt(ItemIDs.UNKNOWN_DUST_DEFAULT);
            ItemIDs.RAW_GORON_ALLOY = configuration.getItem(Strings.RAW_GORON_ALLOY_NAME, ItemIDs.RAW_GORON_ALLOY_DEFAULT).getInt(ItemIDs.RAW_GORON_ALLOY_DEFAULT);
            ItemIDs.GORON_ALLOY_INGOT = configuration.getItem(Strings.GORON_ALLOY_INGOT_NAME, ItemIDs.GORON_ALLOY_INGOT_DEFAULT).getInt(ItemIDs.GORON_ALLOY_INGOT_DEFAULT);
            ItemIDs.SCIENCE_DYE = configuration.getItem(Strings.SCIENCE_DYE_NAME, ItemIDs.SCIENCE_DYE_DEFAULT).getInt(ItemIDs.SCIENCE_DYE_DEFAULT);
            ItemIDs.SPECIAL_FLINT_SHOVEL = configuration.getItem(Strings.SPECIAL_FLINT_SHOVEL_NAME, ItemIDs.SPECIAL_FLINT_SHOVEL_DEFAULT).getInt(ItemIDs.SPECIAL_FLINT_SHOVEL_DEFAULT);
        }
        catch (Exception e)
        {
            FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " had a problem loading its configuration file.");
        }
        finally
        {
            configuration.save();
        }
    
    }
    
}
