package mods.minecraft.darth.dc.core.util;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;

public class GeneralUtil
{

    public static ItemStack convertObjectToItemStack(Object obj)
    {

        if (obj instanceof Item)
            return new ItemStack((Item) obj);
        else if (obj instanceof Block)
            return new ItemStack((Block) obj);
        else if (obj instanceof ItemStack)
            return (ItemStack) obj;
        else
            return null;
        
    }

    
    public static Object[] convertSingleStackToPluralStacks(ItemStack stack)
    {

        ArrayList<ItemStack> list = new ArrayList<ItemStack>();
        ItemStack currentStack;

        for (int i = 0; i < stack.stackSize; i++)
        {
            currentStack = new ItemStack(stack.itemID, 1, stack.getItemDamage());
            list.add(currentStack);
        }

        return list.toArray();
        
    }

    
    public static void sendChat(EntityPlayer player, ChatMessageComponent s)
    {
        
        player.sendChatToPlayer(s);
        
    }

    
}
