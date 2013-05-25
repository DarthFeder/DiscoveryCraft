package mods.minecraft.darth.dc.core.proxy;

import mods.minecraft.darth.dc.client.audio.SoundHandler;
import net.minecraftforge.common.MinecraftForge;


public class ClientProxy extends CommonProxy
{

    @Override
    public void registerSoundHandler()
    {
        MinecraftForge.EVENT_BUS.register(new SoundHandler());
    }
    
}
