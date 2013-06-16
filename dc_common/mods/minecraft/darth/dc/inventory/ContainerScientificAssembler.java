package mods.minecraft.darth.dc.inventory;

import mods.minecraft.darth.dc.tileentity.TileScientificAssembler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerScientificAssembler extends Container
{

    public ContainerScientificAssembler(InventoryPlayer inventoryPlayer, TileScientificAssembler tile)
    {

        //Add the row of crafting storage
        for (int storageSlotIndex = 0; storageSlotIndex < 9; storageSlotIndex++)
            this.addSlotToContainer(new Slot(inventoryPlayer, storageSlotIndex + 36, 44 + storageSlotIndex * 18, 0/*TO-DO*/));
        
        // Add the player's inventory slots to the container
        for (int inventoryRowIndex = 0; inventoryRowIndex < 3; inventoryRowIndex++)
        {
            for (int inventoryColumnIndex = 0; inventoryColumnIndex < 9; ++inventoryColumnIndex)
                this.addSlotToContainer(new Slot(inventoryPlayer, inventoryColumnIndex + inventoryRowIndex * 9 + 9, 44 + inventoryColumnIndex * 18, 104 + inventoryRowIndex * 18));
        }

        // Add the player's action bar slots to the container
        for (int actionBarSlotIndex = 0; actionBarSlotIndex < 9; actionBarSlotIndex++)
            this.addSlotToContainer(new Slot(inventoryPlayer, actionBarSlotIndex, 44 + actionBarSlotIndex * 18, 162));
       
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        return true;
    }

}
