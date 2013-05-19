package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.Strings;

public class ItemNotebookLock extends ItemDC
{

    public ItemNotebookLock(int id)
    {
        super(id);
        this.setUnlocalizedName(Strings.NOTEBOOK_LOCK_NAME);
        this.setCreativeTab(DiscoveryCraft.tabDC);
        maxStackSize = 64;
    }

}
