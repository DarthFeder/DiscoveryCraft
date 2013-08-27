package mods.minecraft.darth.dc.inventory;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class InventoryConcatenator implements IInventory
{
    private final List<Integer> slotMap = new ArrayList<Integer>();
    private final List<IInventory> invMap = new ArrayList<IInventory>();

    private InventoryConcatenator()
    {
        
    }

    public static InventoryConcatenator make()
    {
        return new InventoryConcatenator();
    }

    public InventoryConcatenator add(IInventory inv)
    {
        for (int slot = 0; slot < inv.getSizeInventory(); slot++)
        {
            slotMap.add(slot);
            invMap.add(inv);
        }
        
        return this;
    }

    @Override
    public int getSizeInventory()
    {
        return slotMap.size();
    }

    @Override
    public ItemStack getStackInSlot(int slot)
    {
        return invMap.get(slot).getStackInSlot(slotMap.get(slot));
    }

    @Override
    public ItemStack decrStackSize(int slot, int amount)
    {
        return invMap.get(slot).decrStackSize(slotMap.get(slot), amount);
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot)
    {
        return invMap.get(slot).getStackInSlotOnClosing(slotMap.get(slot));
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack)
    {
        invMap.get(slot).setInventorySlotContents(slotMap.get(slot), stack);
    }

    @Override
    public String getInvName()
    {
        return "";
    }

    @Override
    public boolean isInvNameLocalized()
    {
        return false;
    }

    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }

    @Override
    public void onInventoryChanged()
    {
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer)
    {
        return true;
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
    public boolean isItemValidForSlot(int slot, ItemStack stack)
    {
        return invMap.get(slot).isItemValidForSlot(slotMap.get(slot), stack);
    }
}
