package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.Strings;

public class ItemSonicScrewdriver extends ItemDC
{

    public ItemSonicScrewdriver(int id)
    {
        super(id);
        this.setCreativeTab(DiscoveryCraft.tabDC)
            .setUnlocalizedName(Strings.SONIC_SCREWDRIVER_NAME);
    }

}
