package mods.minecraft.darth.dc.configuration;

import java.io.File;

import mods.minecraft.darth.dc.lib.BlockIDs;
import mods.minecraft.darth.dc.lib.Strings;

import net.minecraftforge.common.Configuration;


public class ConfigHandler
{

    public static Configuration configuration;
    
    public static void init(File configFile)
    {
        //configuration.load();
        
        
        BlockIDs.UNKNOWN_ORE = configuration.getBlock(Strings.UNKNOWN_ORE_NAME, BlockIDs.UNKNOWN_ORE_DEFAULT).getInt(BlockIDs.UNKNOWN_ORE_DEFAULT);
    
    
    
    }
}
