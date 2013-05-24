package mods.minecraft.darth.dc.world;

import cpw.mods.fml.common.registry.GameRegistry;

public class WorldInit
{

    public static void init()
    {
        
        //Register Ore Generation
        GameRegistry.registerWorldGenerator(new OreGeneration());
        
        //Register Dungeon Additions
        DungeonFinds.initDungeon();
        
        
    }
    
}
