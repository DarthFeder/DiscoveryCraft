package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.Strings;

public class ItemSciNotebook extends ItemDC
{

    public ItemSciNotebook(int id)
    {
        super(id);
        this.setUnlocalizedName(Strings.SCI_NOTEBOOK_NAME)
            .setCreativeTab(DiscoveryCraft.tabDC);
    }

}
