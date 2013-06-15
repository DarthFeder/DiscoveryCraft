package mods.minecraft.darth.dc.tileentity;

import mods.minecraft.darth.dc.lib.Strings;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class TileScientificAssembler extends TileDC implements IInventory
{

    public ItemStack[] inventory;
    
    public static final int INVENTORY_SIZE = 9 /*Crafting Grid*/ + 1 /*Output Slot*/ + (1 * 9) /*Storage*/;
    
    public TileScientificAssembler()
    {
        inventory = new ItemStack[INVENTORY_SIZE];
    }
    
    @Override
    public int getSizeInventory()
    {
        return inventory.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot)
    {
        return inventory[slot];
    }

    @Override
    public ItemStack decrStackSize(int slot, int amount)
    {
        ItemStack itemStack = getStackInSlot(slot);
        
        if (itemStack != null)
        {
            if (itemStack.stackSize <= amount)
            {
                setInventorySlotContents(slot, null);
            }
            else
            {
                itemStack = itemStack.splitStack(amount);
                setInventorySlotContents(slot, null);
            }
        }
        
        return itemStack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot)
    {
        ItemStack itemStack = getStackInSlot(slot);
        
        if (itemStack != null)
            setInventorySlotContents(slot, null);
        
        return itemStack;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack itemStack)
    {
        inventory[slot] = itemStack;
        
        if (itemStack != null && itemStack.stackSize > getInventoryStackLimit())
            itemStack.stackSize = getInventoryStackLimit();
    }

    @Override
    public String getInvName()
    {
        return this.hasCustomName() ? this.getCustomName() : Strings.CONTAINER_SCI_ASSEMBLER_NAME;
    }

    @Override
    public boolean isInvNameLocalized()
    {
        return this.hasCustomName();
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
    
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append(super.toString());
        s.append("TileScientificAssembler Data - ");
        
        return s.toString();
    }

}
