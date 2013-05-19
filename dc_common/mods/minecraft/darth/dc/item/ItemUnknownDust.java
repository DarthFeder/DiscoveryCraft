package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.Strings;

public class ItemUnknownDust extends ItemDC
{

    public ItemUnknownDust(int id)
    {
        super(id);
        this.setUnlocalizedName(Strings.UNKNOWN_DUST_NAME);
        this.setCreativeTab(DiscoveryCraft.tabDC);
        maxStackSize = 64;
    }

}
