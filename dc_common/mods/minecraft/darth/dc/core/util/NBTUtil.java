package mods.minecraft.darth.dc.core.util;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;

public class NBTUtil
{
    public static NBTTagCompound getItemData(ItemStack stack)
    {
        NBTTagCompound nbt = stack.getTagCompound();
        
        if (nbt == null)
        {
            nbt = new NBTTagCompound("tag");
            stack.setTagCompound(nbt);
        }
        
        return nbt;
    }

    public static void addItemToolTip(ItemStack stack, String tag, String msg)
    {
        NBTTagCompound nbt = getItemData(stack);
        NBTTagCompound display = nbt.getCompoundTag("display");
        nbt.setCompoundTag("display", display);
        NBTTagList lore = display.getTagList("Lore");
        display.setTag("Lore", lore);
        lore.appendTag(new NBTTagString(tag, msg));
    }

    public static void writeInvToNBT(IInventory inv, String tag, NBTTagCompound data)
    {
        NBTTagList list = new NBTTagList();
        
        for (byte slot = 0; slot < inv.getSizeInventory(); slot++)
        {
            ItemStack stack = inv.getStackInSlot(slot);
            if (stack != null)
            {
                NBTTagCompound itemTag = new NBTTagCompound();
                itemTag.setByte("Slot", slot);
                stack.writeToNBT(itemTag);
                list.appendTag(itemTag);
            }
        }
        
        data.setTag(tag, list);
    }

    public static void readInvFromNBT(IInventory inv, String tag, NBTTagCompound data)
    {
        NBTTagList list = data.getTagList(tag);
        
        for (byte entry = 0; entry < list.tagCount(); entry++)
        {
            NBTTagCompound itemTag = (NBTTagCompound) list.tagAt(entry);
            int slot = itemTag.getByte("Slot");
            
            if (slot >= 0 && slot < inv.getSizeInventory())
            {
                ItemStack stack = ItemStack.loadItemStackFromNBT(itemTag);
                inv.setInventorySlotContents(slot, stack);
            }
        }
    }

    public static void readStacksFromNBT(NBTTagCompound nbt, String name, ItemStack[] stacks)
    {
        NBTTagList nbttaglist = nbt.getTagList(name);

        for (int i = 0; i < stacks.length; ++i)
        {
            if (i < nbttaglist.tagCount())
            {
                NBTTagCompound nbttagcompound2 = (NBTTagCompound) nbttaglist.tagAt(i);
                stacks[i] = ItemStack.loadItemStackFromNBT(nbttagcompound2);
            } else
                stacks[i] = null;
        }
    }

    public static void writeStacksToNBT(NBTTagCompound nbt, String name, ItemStack[] stacks)
    {
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < stacks.length; ++i)
        {
            NBTTagCompound cpt = new NBTTagCompound();
            nbttaglist.appendTag(cpt);
            
            if (stacks[i] != null)
                stacks[i].writeToNBT(cpt);
        }

        nbt.setTag(name, nbttaglist);
    }
}
