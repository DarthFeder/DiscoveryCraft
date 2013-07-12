package mods.minecraft.darth.dc.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

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
    
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        
        // TODO Auto-generated method stub
        return null;
    }
    
}
