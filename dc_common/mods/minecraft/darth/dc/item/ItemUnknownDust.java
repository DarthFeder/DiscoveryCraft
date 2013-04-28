package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.Strings;
import cpw.mods.fml.common.Mod.Item;

public class ItemUnknownDust extends ItemDC
{

    public ItemUnknownDust(int id)
    {
        super(id);
        maxStackSize = 64;
        this.setUnlocalizedName(Strings.UNKNOWN_DUST_NAME);
        this.setCreativeTab(DiscoveryCraft.tabsDC);
    }

}
