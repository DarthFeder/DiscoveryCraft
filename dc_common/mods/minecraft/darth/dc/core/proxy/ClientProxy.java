package mods.minecraft.darth.dc.core.proxy;

import mods.minecraft.darth.dc.client.audio.SoundHandler;
import mods.minecraft.darth.dc.client.gui.inventory.GuiMultiFurnace;
import mods.minecraft.darth.dc.client.gui.inventory.GuiScientificAssembler;
import mods.minecraft.darth.dc.core.handlers.KeyBindingHandler;
import mods.minecraft.darth.dc.event.GuiEffectBar;
import mods.minecraft.darth.dc.lib.GuiIDs;
import mods.minecraft.darth.dc.tileentity.TileEntityMultiFurnaceCore;
import mods.minecraft.darth.dc.tileentity.TileScientificAssembler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.KeyBindingRegistry;


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
    public void registerGuiEvent()
    {
    	MinecraftForge.EVENT_BUS.register(new GuiEffectBar(Minecraft.getMinecraft()));
    }
    
    @Override
    public void initRenderingAndTextures()
    {
        
        
    }
    
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        
    	TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
    	
        if (ID == GuiIDs.ASSEMBLER1)
            return new GuiScientificAssembler(player.inventory, (TileScientificAssembler) tileEntity, world);
        else if (ID == GuiIDs.MULTI_FURNACE)
            return new GuiMultiFurnace(player.inventory, (TileEntityMultiFurnaceCore) tileEntity);
        else
            return null;
    }
    
}
