package mods.minecraft.darth.dc.core.util;

import mods.minecraft.darth.dc.lib.Colors;
import mods.minecraft.darth.dc.lib.Strings;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ItemUtil
{

    public static String toString(ItemStack itemStack)
    {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("itemID: %d, metaData: %d, stackSize: %d, itemName: %s, className: %s", itemStack.itemID, itemStack.getItemDamage(), itemStack.stackSize, itemStack.getItemName(), itemStack.getItem().getClass().toString()));

        return stringBuilder.toString();
    }


    /**
     * Compares two ItemStacks for equality, testing itemID, metaData, stackSize, and their NBTTagCompounds (if they are present)
     * 
     * @param first
     *      The first ItemStack being tested for equality
     * @param second
     *      The second ItemStack being tested for equality
     * @return
     *      true if the two ItemStacks are equivalent, false otherwise
     */
    public static boolean compare(ItemStack first, ItemStack second)
    {
        
        // Check to see if either argument is null
        if ((first != null) && (second != null))
        {
            // Check the item IDs
            if (first.itemID == second.itemID)
            {
                // Check the meta data
                if (first.getItemDamage() == second.getItemDamage())
                {
                    // Check the stack size
                    if (first.stackSize == second.stackSize)
                    {
                        // If at least one of the ItemStacks has a NBTTagCompound, test for equality
                        if (first.hasTagCompound() || second.hasTagCompound())
                        {
                            // If one of the stacks has a tag compound, but not both, they are not equal
                            if (!(first.hasTagCompound() && second.hasTagCompound()))
                            {
                                return false;
                            }
                            
                            // Otherwise, they both have tag compounds and we need to test them for equality
                            else
                            {
                                return first.getTagCompound().equals(second.getTagCompound());
                            }
                        }
                        
                        // Otherwise, they must be equal if we have gotten this far (item IDs, meta data, NBT data and stack size all match)
                        else
                        {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
        
    }
    
    
    /**
     * Compares two ItemStacks for equality, testing itemID, metaData, and their NBTTagCompounds (if they are present)
     * 
     * @param first
     *      The first ItemStack being tested for equality
     * @param second
     *      The second ItemStack being tested for equality
     * @return
     *      true if the two ItemStacks are equivalent, false otherwise
     */
    public static boolean compareIgnoreStackSize(ItemStack first, ItemStack second)
    {
        
        // Check to see if either argument is null
        if ((first != null) && (second != null))
        {
            // Check the item IDs
            if (first.itemID == second.itemID)
            {
                // Check the meta data
                if (first.getItemDamage() == second.getItemDamage())
                {
                    // If at least one of the ItemStacks has a NBTTagCompound, test for equality
                    if (first.hasTagCompound() || second.hasTagCompound())
                    {
                        // If one of the stacks has a tag compound, but not both, they are not equal
                        if (!(first.hasTagCompound() && second.hasTagCompound()))
                        {
                            return false;
                        }
                        
                        // Otherwise, they both have tag compounds and we need to test them for equality
                        else
                        {
                            return first.getTagCompound().equals(second.getTagCompound());
                        }
                    }
                    
                    // Otherwise, they must be equal if we have gotten this far (item IDs, meta data, and NBT data all match)
                    else
                    {
                        return true;
                    }
                }
            }
        }

        return false;
        
    }

    
    public static boolean hasColor(ItemStack itemStack)
    {
        return !itemStack.hasTagCompound() ? false : !itemStack.getTagCompound().hasKey(Strings.NBT_ITEM_DISPLAY) ? false : itemStack.getTagCompound().getCompoundTag(Strings.NBT_ITEM_DISPLAY).hasKey(Strings.NBT_ITEM_COLOR);
    }


    public static int getColor(ItemStack itemStack)
    {
        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();

        if (nbtTagCompound == null)
            return Integer.parseInt(Colors.PURE_WHITE, 16);
        else
        {
            NBTTagCompound displayTagCompound = nbtTagCompound.getCompoundTag(Strings.NBT_ITEM_DISPLAY);
            return displayTagCompound == null ? Integer.parseInt(Colors.PURE_WHITE, 16) : displayTagCompound.hasKey(Strings.NBT_ITEM_COLOR) ? displayTagCompound.getInteger(Strings.NBT_ITEM_COLOR) : Integer.parseInt(Colors.PURE_WHITE, 16);
        }
    }


    public static void setColor(ItemStack itemStack, int color)
    {
        if (itemStack != null)
        {
            NBTTagCompound nbtTagCompound = itemStack.getTagCompound();

            if (nbtTagCompound == null)
            {
                nbtTagCompound = new NBTTagCompound();
                itemStack.setTagCompound(nbtTagCompound);
            }

            NBTTagCompound colourTagCompound = nbtTagCompound.getCompoundTag(Strings.NBT_ITEM_DISPLAY);

            if (!nbtTagCompound.hasKey(Strings.NBT_ITEM_DISPLAY))
            {
                nbtTagCompound.setCompoundTag(Strings.NBT_ITEM_DISPLAY, colourTagCompound);
            }

            colourTagCompound.setInteger(Strings.NBT_ITEM_COLOR, color);
        }
    }

    
}
