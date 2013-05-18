package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.Strings;

public class ItemMonocleLens extends ItemDC
{

    public ItemMonocleLens(int id)
    {
        super(id);
        this.setUnlocalizedName(Strings.MONOCLE_LENS_NAME);
        this.setCreativeTab(DiscoveryCraft.tabDC);
        this.setMaxStackSize(64);
    }

}
