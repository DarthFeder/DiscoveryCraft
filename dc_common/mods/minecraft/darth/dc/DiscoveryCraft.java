package mods.minecraft.darth.dc;


import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import mods.minecraft.darth.dc.block.ModBlocks;
import mods.minecraft.darth.dc.creativetabs.CreativeTabDC;
import mods.minecraft.darth.dc.item.ModItems;
import mods.minecraft.darth.dc.lib.Reference;


/**
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

        @Instance(Reference.MOD_ID)
        public static DiscoveryCraft instance;
        
        
        public static CreativeTabs tabsDC = new CreativeTabDC(CreativeTabs.getNextID(), Reference.MOD_NAME);
    
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event)
        {
            
            //Initialize Blocks
            ModBlocks.init();
            
            //Initialize Items
            ModItems.init();
            
        }
    
    
        @Init
        public void load(FMLInitializationEvent event)
        {
            System.out.println("TESTING");
            
        }
        
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event)
        {
            
            
        }
    
}