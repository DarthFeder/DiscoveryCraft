package mods.minecraft.darth.dc.client.gui.inventory;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.minecraft.darth.dc.inventory.ContainerScientificAssembler;
import mods.minecraft.darth.dc.tileentity.TileScientificAssembler;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

@SideOnly(Side.CLIENT)
public class GuiScientificAssembler extends GuiContainer
{
    private TileScientificAssembler tile;

    public GuiScientificAssembler(InventoryPlayer player, TileScientificAssembler tile)
    {
        super(new ContainerScientificAssembler(player, tile));
        this.tile = tile;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        // TODO Auto-generated method stub
        
    }

}
