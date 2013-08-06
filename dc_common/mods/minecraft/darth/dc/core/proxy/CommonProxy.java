package mods.minecraft.darth.dc.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

import mods.minecraft.darth.dc.client.gui.inventory.GuiScientificAssembler;
import mods.minecraft.darth.dc.inventory.ContainerScientificAssembler;
import mods.minecraft.darth.dc.lib.GuiIDs;
import mods.minecraft.darth.dc.lib.Strings;
import mods.minecraft.darth.dc.tileentity.TileScientificAssembler;


public class CommonProxy implements IGuiHandler
{

    public void registerKeyBindingHandler() {}
    
    public void registerSoundHandler() {}
    
    public void registerGuiEvent() {}
    
    public void initRenderingAndTextures() {}

    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileScientificAssembler.class, Strings.TE_SCI_ASSEMBLER_NAME);
    }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        
        if (ID == GuiIDs.ASSEMBLER1)
            return new ContainerScientificAssembler(player.inventory, (TileScientificAssembler) tileEntity, world);
        else
            return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        
        if (ID == GuiIDs.ASSEMBLER1)
            return new GuiScientificAssembler(player.inventory, (TileScientificAssembler) tileEntity, world);
        else
            return null;
    }
    
}
