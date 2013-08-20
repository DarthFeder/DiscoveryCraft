package mods.minecraft.darth.dc.event;

import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.relauncher.Side;

public class EventRegistry
{

    public static void init(FMLInitializationEvent event)
    {
        
        //Register Player Death Event
        MinecraftForge.EVENT_BUS.register(new PlayerDeathEvent());
        
        //Register Cloak (Capes) Event
        if (event.getSide() == Side.CLIENT)
            MinecraftForge.EVENT_BUS.register(new EventCloakRender());
        
    }

    
}
