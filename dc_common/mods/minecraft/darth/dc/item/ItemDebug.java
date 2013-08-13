package mods.minecraft.darth.dc.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.world.World;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.block.ModBlocks;
import mods.minecraft.darth.dc.core.util.GeneralUtil;
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
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
       if (!par3World.isRemote)
       {
           if (par3World.getBlockId(par4, par5, par6) == ModBlocks.scientificAssembler.blockID)
               GeneralUtil.sendChat(player, ChatMessageComponent.func_111077_e(par3World.getBlockTileEntity(par4, par5, par6).toString()));
       }
        
        return false;
    }
    
    @Override
    public boolean func_111207_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, EntityLivingBase par3EntityLivingBase)
    {
        if (!par2EntityPlayer.worldObj.isRemote)
        {
            GeneralUtil.sendChat(par2EntityPlayer, ChatMessageComponent.func_111077_e(Integer.toString(par3EntityLivingBase.entityId)));
        }

        return false;
    }
    
}
