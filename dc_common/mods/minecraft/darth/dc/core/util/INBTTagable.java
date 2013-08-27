package mods.minecraft.darth.dc.core.util;

import net.minecraft.nbt.NBTTagCompound;

public interface INBTTagable
{
    void readFromNBT(NBTTagCompound nbttagcompound);

    void writeToNBT(NBTTagCompound nbttagcompound);
}
