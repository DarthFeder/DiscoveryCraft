package mods.minecraft.darth.dc.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.Strings;

public class ItemDebug extends ItemDC
{
    
    public ItemDebug(int id)
    {
        super(id);
        this.setUnlocalizedName(Strings.DEBUG_TOOL_NAME)
        .setCreativeTab(DiscoveryCraft.tabDC);
    }
    
    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        switch(par3World.getBlockId(par4, par5, par6))
        {
            
        };
        
        return false;
    }
    
}
