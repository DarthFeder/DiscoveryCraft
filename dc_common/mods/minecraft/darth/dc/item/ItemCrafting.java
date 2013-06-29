package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;

public class ItemCrafting extends ItemDC
{

    public ItemCrafting(int id)
    {
        super(id);
        this.setMaxStackSize(64)
            .setCreativeTab(DiscoveryCraft.tabDC);
    }

}
