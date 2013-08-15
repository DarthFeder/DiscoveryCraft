package mods.minecraft.darth.dc.block;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.BlockIDs;
import mods.minecraft.darth.dc.lib.Strings;

public class ModBlocks
{

    //Block Instances
    public static Block unknownOre;
    public static Block glowingUnknownOre;
    public static Block scientificAssembler;
    public static Block mfCore;
    public static Block mfDummy;
    
    
    public static void init()
    {
        //Initialize each block
        unknownOre = new BlockUnknownOre(BlockIDs.UNKNOWN_ORE, false).setUnlocalizedName(Strings.UNKNOWN_ORE_NAME).setCreativeTab(DiscoveryCraft.tabDC).setHardness(8F).setResistance(80).setStepSound(Block.soundStoneFootstep).setLightValue(0.2F).setLightOpacity(4);
        glowingUnknownOre = new BlockUnknownOre(BlockIDs.GLOWING_UNKNOWN_ORE, true).setUnlocalizedName(Strings.GLOWING_UNKNOWN_ORE_NAME).setHardness(8F).setResistance(80).setStepSound(Block.soundStoneFootstep).setLightValue(0.5F).setLightOpacity(9);
        scientificAssembler = new BlockScientificAssembler(BlockIDs.SCIENTIFIC_ASSEMBLER).setUnlocalizedName(Strings.SCIENTIFIC_ASSEMBLER_NAME).setCreativeTab(DiscoveryCraft.tabDC);
        mfCore = new BlockMultiFurnaceCore(BlockIDs.MF_CORE);
        mfDummy = new BlockMultiFurnaceDummy(BlockIDs.MF_DUMMY);
        
        blockHarvests();
        blockRegistry();
        
    }
    
    private static void blockHarvests()
    {
        
        //Set Block Harvest Levels
        MinecraftForge.setBlockHarvestLevel(unknownOre, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(glowingUnknownOre, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(scientificAssembler, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(mfCore, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(mfDummy, "pickaxe", 0);
        
    }
    
    private static void blockRegistry()
    {
        
        //GameRegistry Initialization
        GameRegistry.registerBlock(unknownOre, Strings.UNKNOWN_ORE_NAME);
        GameRegistry.registerBlock(glowingUnknownOre, Strings.GLOWING_UNKNOWN_ORE_NAME);
        GameRegistry.registerBlock(scientificAssembler, Strings.SCIENTIFIC_ASSEMBLER_NAME);
        GameRegistry.registerBlock(mfCore, Strings.MF_CORE_NAME);
        GameRegistry.registerBlock(mfDummy, Strings.MF_DUMMY_NAME);
        
    }
    
}
