package mods.minecraft.darth.dc.core.handlers;

import mods.minecraft.darth.dc.core.util.ItemUtil;
import mods.minecraft.darth.dc.item.ModItems;

import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler
{
    
    @Override
    public int getBurnTime(ItemStack fuel)
    {
        if (ItemUtil.compareIgnoreStackSize(fuel, new ItemStack(ModItems.unknownDust)))
            return 600;
        else
            return 0;
    }
    
}
