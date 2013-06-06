package mods.minecraft.darth.dc.world;

import java.util.logging.Level;

import mods.minecraft.darth.dc.core.util.LogUtil;
import mods.minecraft.darth.dc.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class WorldInit
{

    public static void init()
    {
        
        //Register Ore Generation
        GameRegistry.registerWorldGenerator(new OreGeneration());
        
        //Register Dungeon Additions
        DungeonFinds.initDungeon();
        
        //Log Completion
        LogUtil.log(Level.INFO, Strings.WORLD_LOAD_SUCCESS);
        
    }
    
}
