package mods.minecraft.darth.dc.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import cpw.mods.fml.client.registry.KeyBindingRegistry;
import mods.minecraft.darth.dc.client.audio.SoundHandler;
import mods.minecraft.darth.dc.core.handlers.KeyBindingHandler;
import mods.minecraft.darth.dc.tileentity.GuiScientificAssembler;
import mods.minecraft.darth.dc.tileentity.TileScientificAssembler;
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
        
    	TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        if(ID==0){
        	
                return new GuiScientificAssembler(player.inventory, (TileScientificAssembler) tileEntity);
                
        }
        return null;
    }
    
}
