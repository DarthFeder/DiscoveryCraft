package mods.minecraft.darth.dc.inventory;

import mods.minecraft.darth.dc.tileentity.TileScientificAssembler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.world.World;

public class ContainerScientificAssembler extends Container
{
    protected TileScientificAssembler tileEntity;
    private World worldObj;
    
    /** The crafting matrix inventory (3x3). */
    public InventoryCraftingDC craftMatrix = new InventoryCraftingDC(this, 3, 3);
    public IInventory craftResult = new InventoryCraftingResultDC();

    
    public ContainerScientificAssembler (InventoryPlayer inventoryPlayer, TileScientificAssembler te, World world)
    {
        //super(te.getSizeInventory());
        
        tileEntity = te;
        this.worldObj = world;
        
        this.addSlotToContainer(new SlotCrafting(inventoryPlayer.player, this.craftMatrix, this.craftResult, 0, 124, 35));
        
        //the Slot constructor takes the IInventory and the slot number in that it binds to
        //and the x-y coordinates it resides on-screen
        
        int x;
        int y;
        
        //crafting grid
        for (x = 0; x < 3; x++)
        {
            for (y = 0; y < 3; y++)
                this.addSlotToContainer(new Slot(this.craftMatrix, y + x * 3, 30 + y * 18, 17 + x * 18));
        }
        
        
        //bottom inventory
        for(x = 0; x < 9; x++)
        {
            this.addSlotToContainer(new Slot(tileEntity, 8 + x, 8 + x * 18, 82));
        }
        

        //commonly used vanilla code that adds the player's inventory
            
        this.bindPlayerInventory(inventoryPlayer);
        
        this.onCraftMatrixChanged(this.craftMatrix);
    }
    
    protected void bindPlayerInventory(InventoryPlayer inventoryPlayer)
    {
        int i;
        int j;
        
        //player main inv
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 9; j++)
                addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 111 + i * 18)); 
        }
        
        //player hotbar
        for (j = 0; j < 9; ++j)
            this.addSlotToContainer(new Slot(inventoryPlayer, j, 8 + j * 18, 169));
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        return true;
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot)
    {
        ItemStack stack = null;
        Slot slotObject = (Slot) inventorySlots.get(slot);

        //null checks and checks if the item can be stacked (maxStackSize > 1)
        if (slotObject != null && slotObject.getHasStack())
        {
            ItemStack stackInSlot = slotObject.getStack();
            stack = stackInSlot.copy();
            
            if (slot == 0)
            {
                if (!this.mergeItemStack(stackInSlot, 10, 46, true))
                {
                    return null;
                }

                slotObject.onSlotChange(stackInSlot, stack);
            }
            
            //merges the item into player inventory since its in the tileEntity
            if (slot < TileScientificAssembler.INVENTORY_SIZE)
            {
                if (!this.mergeItemStack(stackInSlot, 0, 35, true))
                    return null;
            }
            //places it into the tileEntity is possible since its in the player inventory
            else if (!this.mergeItemStack(stackInSlot, 0, TileScientificAssembler.INVENTORY_SIZE, false))
                return null;

            
            if (stackInSlot.stackSize == 0)
                slotObject.putStack(null);
            else
                slotObject.onSlotChanged();

            if (stackInSlot.stackSize == stack.stackSize)
                return null;
            
            
            if (stackInSlot.stackSize == stack.stackSize)
                return null;

            slotObject.onPickupFromSlot(player, stackInSlot);
        }
        
        return stack;
    }
    
    /**
     * Callback for when the crafting matrix is changed.
     */
    public void onCraftMatrixChanged(IInventory par1IInventory)
    {
        this.craftResult.setInventorySlotContents(0, CraftingManager.getInstance().findMatchingRecipe((InventoryCrafting) this.craftMatrix, this.worldObj));
    }
    
    


   
}
