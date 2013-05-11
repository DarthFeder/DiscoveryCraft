package mods.minecraft.darth.dc.block;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;

import mods.minecraft.darth.dc.lib.BlockIDs;
import mods.minecraft.darth.dc.lib.Strings;

public class ModBlocks
{

    //Block Instances
    public static Block unknownOre;
    
    
    public static void init()
    {
        //Initialize each block
        unknownOre = new BlockUnknownOre(BlockIDs.UNKNOWN_ORE);
        
        
        MinecraftForge.setBlockHarvestLevel(unknownOre, "pickaxe", 3);
        
        blockRegistry();
        blockRecipiesInit();
        
    }
    
    private static void blockRegistry()
    {
        
        //GameRegistry Initialization
        GameRegistry.registerBlock(unknownOre, Strings.UNKNOWN_ORE_NAME);
        
    }
    
    private static void blockRecipiesInit()
    {
        
        
        
    }
}
