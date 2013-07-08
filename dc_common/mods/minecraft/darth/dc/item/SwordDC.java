package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.lib.Reference;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SwordDC extends ItemSword
{

	public SwordDC(int id, EnumToolMaterial par2EnumToolMaterial)
	{
		super(id, par2EnumToolMaterial);
	}

	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}