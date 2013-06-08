package mods.minecraft.darth.dc.core.proxy;

import cpw.mods.fml.client.registry.KeyBindingRegistry;
import mods.minecraft.darth.dc.client.audio.SoundHandler;
import mods.minecraft.darth.dc.core.handlers.KeyBindingHandler;
import net.minecraftforge.common.MinecraftForge;


public class ClientProxy extends CommonProxy
{

    @Override
    public void registerKeyBindingHandler()
    {
        KeyBindingRegistry.registerKeyBinding(new KeyBindingHandler());
    }
    
    @Override
    public void registerSoundHandler()
    {
        MinecraftForge.EVENT_BUS.register(new SoundHandler());
    }
    
}
