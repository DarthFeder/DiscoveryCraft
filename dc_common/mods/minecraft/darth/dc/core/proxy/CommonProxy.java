package mods.minecraft.darth.dc.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

import mods.minecraft.darth.dc.lib.Strings;
import mods.minecraft.darth.dc.tileentity.ContainerScientificAssembler;
import mods.minecraft.darth.dc.tileentity.TileScientificAssembler;


public class CommonProxy implements IGuiHandler
{

    public void registerKeyBindingHandler() {}
    
    public void registerSoundHandler() {}

    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileScientificAssembler.class, Strings.TE_SCI_ASSEMBLER_NAME);
    }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        System.out.println("THECODEWASCALLED");
        if(ID==0){
                return new ContainerScientificAssembler(player.inventory, (TileScientificAssembler) tileEntity);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
}
