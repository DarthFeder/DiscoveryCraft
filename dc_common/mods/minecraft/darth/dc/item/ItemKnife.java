package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.Strings;

public class ItemKnife extends ItemDC
{

    public ItemKnife(int id)
    {
        super(id);
        this.setCreativeTab(DiscoveryCraft.tabDC)
            .setUnlocalizedName(Strings.KNIFE_NAME);
    }

}
