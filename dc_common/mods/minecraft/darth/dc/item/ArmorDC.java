package mods.minecraft.darth.dc.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.Reference;
import mods.minecraft.darth.dc.lib.Textures;

public class ArmorDC extends ItemArmor
{
    
    public ArmorDC(int id, EnumArmorMaterial enumArmorMaterial, int par3, int par4 /* 0 for helmet, 1 for chest, 2 for leggings, 3 for boots*/)
    {
        super(id, enumArmorMaterial, par3, par4);
        
        this.setMaxDamage(enumArmorMaterial.getDurability(par4))
            .setCreativeTab(DiscoveryCraft.tabDC)
            .setMaxStackSize(1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
        if (stack.isItemEqual(new ItemStack(ModItems.monocleArmor)))
            return Textures.ARMOR_MONOCLE;
        else
            return null;
    }
    
}
