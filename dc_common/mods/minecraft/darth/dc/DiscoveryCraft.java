package mods.minecraft.darth.dc;


import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.FingerprintWarning;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

import mods.minecraft.darth.dc.block.ModBlocks;
import mods.minecraft.darth.dc.command.CommandHandler;
import mods.minecraft.darth.dc.core.handlers.LocalizationHandler;
import mods.minecraft.darth.dc.core.proxy.CommonProxy;
import mods.minecraft.darth.dc.core.util.LogUtil;
import mods.minecraft.darth.dc.creativetabs.CreativeTabDC;
import mods.minecraft.darth.dc.item.ModItems;
import mods.minecraft.darth.dc.lib.Reference;
import mods.minecraft.darth.dc.recipe.ModRecipes;
import mods.minecraft.darth.dc.world.WorldInit;


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
        
        @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
        public static CommonProxy proxy;
        
        
        public static CreativeTabs tabDC = new CreativeTabDC(Reference.MOD_ID);

        
        @FingerprintWarning
        public void invalidFingerprintWarning()
        {
            
            
        }
        
        @ServerStarting
        public void serverStarting(FMLServerStartingEvent event)
        {
            
            //Initialize Commands
            CommandHandler.initCommands(event);
            
        }
        
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event)
        {
            
            //Register Logger
            LogUtil.init();
            
            //Load Language Localization Files
            LocalizationHandler.loadLanguages();
            
            //Register Sound Handler (Client-Side)
            proxy.registerSoundHandler();
            
            //Initialize Blocks
            ModBlocks.init();
            
            //Initialize Items
            ModItems.init();
            
            //Initialize Mod Recipes
            ModRecipes.init();
            
        }
    
    
        @Init
        public void load(FMLInitializationEvent event)
        {

            //Register World Additions
            WorldInit.init();
            
        }
        
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event)
        {
            
            
        }
    
}
