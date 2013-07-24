package mods.minecraft.darth.dc.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
    //returns an instance of the Container you made earlier
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
                    int x, int y, int z) {
            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            System.out.println("THECODEWASCALLED");
            if(tileEntity instanceof TileScientificAssembler){
                    return new ContainerScientificAssembler(player.inventory, (TileScientificAssembler) tileEntity);
            }
            return null;
    }

    //returns an instance of the Gui you made earlier
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
                    int x, int y, int z) {
            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            System.out.println("THECODEWASCALLED");
            if(tileEntity instanceof TileScientificAssembler){
            	System.out.println("isTileSA");
                    return new GuiScientificAssembler(player.inventory, (TileScientificAssembler) tileEntity);
                    
            }
            return null;

    }
}