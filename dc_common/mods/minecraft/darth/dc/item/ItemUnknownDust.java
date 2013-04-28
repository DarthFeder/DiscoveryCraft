package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import cpw.mods.fml.common.Mod.Item;

public class ItemUnknownDust extends ItemDC
{

    public ItemUnknownDust(int id)
    {
        super(id);
        maxStackSize = 64;
        this.setCreativeTab(DiscoveryCraft.tabsDC);
    }

}
