package mods.minecraft.darth.dc.event;

import net.minecraft.client.Minecraft;

import net.minecraftforge.common.MinecraftForge;

public class EventRegistry
{

    public static void init()
    {
        
        //Register Player Death Event
        MinecraftForge.EVENT_BUS.register(new PlayerDeathEvent());
        
        //Initiate Effect Bar on HUD
        MinecraftForge.EVENT_BUS.register(new GuiEffectBar(Minecraft.getMinecraft()));
        
    }
    
}
