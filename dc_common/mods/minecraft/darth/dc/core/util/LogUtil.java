package mods.minecraft.darth.dc.core.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

import mods.minecraft.darth.dc.lib.Reference;
import mods.minecraft.darth.dc.lib.Strings;

//Note for self - levels: SEVERE, WARNING, INFO, FINE, FINER, FINEST, OFF, ALL, CONFIG

public class LogUtil
{

    //DiscoveryCraft's own log instance
    private static Logger dcLogger = Logger.getLogger(Reference.MOD_NAME);
    
    public static void init()
    {
        dcLogger.setParent(FMLLog.getLogger());
        
        log(Level.INFO, Strings.LOG_INIT_SUCCESS);
    }
    
    public static void log(Level logLevel, String msg)
    {
        dcLogger.log(logLevel, msg);
    }
    
    public static void info(String msg)
    {
        dcLogger.log(Level.INFO, msg);
    }
    
    public static void warning(String msg)
    {
        dcLogger.log(Level.WARNING, msg);
    }
    
    public static void severe(String msg)
    {
        dcLogger.log(Level.SEVERE, msg);
    }
    
    public static void off(String msg)
    {
        dcLogger.log(Level.OFF, msg);
    }
    
    public static void all(String msg)
    {
        dcLogger.log(Level.ALL, msg);
    }
    
    public static void fine(String msg)
    {
        dcLogger.log(Level.FINE, msg);
    }
    
    public static void finer(String msg)
    {
        dcLogger.log(Level.FINER, msg);
    }
    
    public static void finest(String msg)
    {
        dcLogger.log(Level.FINEST, msg);
    }
    
    public static void config(String msg)
    {
        dcLogger.log(Level.CONFIG, msg);
    }
}
