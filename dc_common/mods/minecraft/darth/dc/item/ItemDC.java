package mods.minecraft.darth.dc.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.minecraft.darth.dc.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemDC extends Item
{

    public ItemDC(int id)
    {
        super(id);
        maxStackSize = 1;
        
        
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
