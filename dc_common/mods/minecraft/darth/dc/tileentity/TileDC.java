package mods.minecraft.darth.dc.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;

public class TileDC extends TileEntity
{

    protected ForgeDirection orientation;
    private byte state;
    private String customName;
    
    public TileDC()
    {
        
    	
        state = 0;
        customName = "";
        
    }
    
    public ForgeDirection getOrientation()
    {
        return orientation;
    }
    
    public void setOrientation(ForgeDirection orientation)
    {
        this.orientation = orientation;
    }
    
    public void setOrientation(int orientation)
    {
        this.orientation = ForgeDirection.getOrientation(orientation);
    }

    public short getState()
    {
        return state;
    }
    
    public void setState(byte state)
    {
        this.state = state;
    }


    public boolean hasCustomName()
    {
        return customName != null && customName.length() > 0;
    }


    public String getCustomName()
    {
        return customName;
    }


    public void setCustomName(String customName)
    {
        this.customName = customName;
    }


    public boolean isUseableByPlayer(EntityPlayer player)
    {
        return true;
    }

    public String toString()
    {
        StringBuilder s = new StringBuilder();
        
        s.append(String.format("TileDC Data - xCoord: %d, yCoord: %d, zCoord: %d, customName: '%s', orientation: %s, state: %d\n", xCoord, yCoord, zCoord, customName, orientation, state));
        
        return s.toString();
    }
}
