package mods.minecraft.darth.dc.world;

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
        LogUtil.info(Strings.WORLD_LOAD_SUCCESS);
        
    }
    
}
