package mods.minecraft.darth.dc;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import mods.minecraft.darth.dc.lib.Reference;


/*
 * DiscoveryCraft
 * 
 * @author Darth_Feder
 * 
 * 
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = Reference.DEPENDENCIES, acceptedMinecraftVersions = Reference.MC_VERSIONS, modExclusionList = Reference.EXCLUSION_MODS)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DiscoveryCraft
{

        @PreInit
        public void preInit(FMLPreInitializationEvent event)
        {
            
            
        }
    
    
        @Init
        public void init(FMLInitializationEvent event)
        {
            
            
        }
        
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event)
        {
            
            
        }
    
}
