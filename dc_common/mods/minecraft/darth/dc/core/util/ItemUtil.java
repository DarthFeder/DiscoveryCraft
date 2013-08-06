package mods.minecraft.darth.dc.core.util;

import mods.minecraft.darth.dc.lib.Colors;
import mods.minecraft.darth.dc.lib.Strings;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ItemUtil
{
    private static ItemUtil instance;

    public static ItemUtil instance()
    {
        if (instance == null)
            instance = new ItemUtil();

        return instance;
    }

    public static void setInstance(ItemUtil inst)
    {
        instance = inst;
    }

    protected ItemUtil()
    {
        
    }

    /* STACK MERGING */
    /**
     * Checks if two ItemStacks are identical enough to be merged
     *
     * @param stack1 - The first stack
     * @param stack2 - The second stack
     * @return true if stacks can be merged, false otherwise
     */
    public boolean canStacksMerge(ItemStack stack1, ItemStack stack2)
    {
        if (stack1 == null || stack2 == null)
            return false;
        if (!stack1.isItemEqual(stack2))
            return false;
        if (!ItemStack.areItemStackTagsEqual(stack1, stack2))
            return false;
        
        return true;
    }

    /**
     * Merges mergeSource into mergeTarget
     *
     * @param mergeSource - The stack to merge into mergeTarget, this stack is
     * not modified
     * @param mergeTarget - The target merge, this stack is modified if doMerge
     * is set
     * @param doMerge - To actually do the merge
     * @return The number of items that was successfully merged.
     */
    public int mergeStacks(ItemStack mergeSource, ItemStack mergeTarget, boolean doMerge)
    {
        if (!canStacksMerge(mergeSource, mergeTarget))
            return 0;
        
        int mergeCount = Math.min(mergeTarget.getMaxStackSize() - mergeTarget.stackSize, mergeSource.stackSize);
        
        if (mergeCount < 1)
            return 0;
        if (doMerge)
            mergeTarget.stackSize += mergeCount;

        return mergeCount;
    }
    
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
