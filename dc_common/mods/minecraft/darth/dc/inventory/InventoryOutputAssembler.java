package mods.minecraft.darth.dc.inventory;

import net.minecraft.item.ItemStack;

import mods.minecraft.darth.dc.inventory.sample.SimpleInventory;

public class InventoryOutputAssembler extends SimpleInventory
{
    public InventoryOutputAssembler(int size, String name, int stackLimit)
    {
        super(size, name, stackLimit);
    }
    
    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack)
    {
        return false;
    }

    @Override
    public ItemStack decrStackSize(int slotId, int count)
    {
        if (slotId < _contents.length && _contents[slotId] != null) 
        {
            if (_contents[slotId].stackSize > count)
            {
                ItemStack result = _contents[slotId].splitStack(count);
                onInventoryChanged();
                return result;
            }
            
            ItemStack stack = _contents[slotId];
            _contents[slotId] = null;
            onInventoryChanged();
            
            return stack;
        }
        
        return null;
    }
}
