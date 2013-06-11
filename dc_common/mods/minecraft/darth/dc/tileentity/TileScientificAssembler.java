package mods.minecraft.darth.dc.tileentity;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class TileScientificAssembler extends TileDC implements IInventory
{

    public ItemStack[] inventory;
    
    public static final int INVENTORY_SIZE = 9 + 1 * 9;
    
    public TileScientificAssembler()
    {
        
    }
    
    @Override
    public int getSizeInventory()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ItemStack getStackInSlot(int i)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ItemStack decrStackSize(int i, int j)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int i)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setInventorySlotContents(int i, ItemStack itemstack)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getInvName()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isInvNameLocalized()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }

    @Override
    public void openChest()
    {
    }

    @Override
    public void closeChest()
    {      
    }

    @Override
    public boolean isStackValidForSlot(int i, ItemStack itemstack)
    {
        return true;
    }

}
