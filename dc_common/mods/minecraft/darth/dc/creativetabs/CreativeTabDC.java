package mods.minecraft.darth.dc.creativetabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.minecraft.darth.dc.lib.Reference;

import net.minecraft.creativetab.CreativeTabs;


public class CreativeTabDC extends CreativeTabs
{
    
    public CreativeTabDC(String label)
    {
        super(label);
    }

    public CreativeTabDC(int par1, String par2str)
    {
        super(par1, par2str);
    }

    @Override
    @SideOnly(Side.CLIENT)
    //Give item id of item to display as tab icon
    public int getTabIconItemIndex()
    {
        return Reference.DC_CREATIVE_TAB_ICON;
    }
}
