package mods.minecraft.darth.dc.client.gui.slots;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class SlotOutput extends SlotBase
{
    public SlotOutput(IInventory iinventory, int slotIndex, int posX, int posY)
    {
        super(iinventory, slotIndex, posX, posY);
    }

    @Override
    public boolean isItemValid(ItemStack itemstack)
    {
        return false;
    }
    
    @Override
    public boolean canShift()
    {
        return false;
    }
    
    @Override
    public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack)
    {
        super.onPickupFromSlot(par1EntityPlayer, par2ItemStack);
    }
}
