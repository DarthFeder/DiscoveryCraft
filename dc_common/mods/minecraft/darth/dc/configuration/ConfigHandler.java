package mods.minecraft.darth.dc.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.FMLLog;

import mods.minecraft.darth.dc.lib.Reference;


public class ConfigHandler
{

    public static Configuration configuration;
    
    public static void init(File configFile)
    {
        
        configuration = new Configuration(configFile);
        
        try
        {
            configuration.load();
        
    
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
