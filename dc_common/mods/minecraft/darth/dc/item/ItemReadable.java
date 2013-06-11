package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemReadable extends ItemDC
{

    public ItemReadable(int id)
    {
        super(id);
        this.setCreativeTab(DiscoveryCraft.tabDC);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        
        return par1ItemStack;
        
    }
}
