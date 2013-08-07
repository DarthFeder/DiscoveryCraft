package mods.minecraft.darth.dc.item;

import java.util.Random;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.core.util.ItemUtil;
import mods.minecraft.darth.dc.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemSpecialFlintShovel extends ShovelDC
{

    public ItemSpecialFlintShovel(int id, EnumToolMaterial par2EnumToolMaterial)
    {
        super(id, par2EnumToolMaterial);
        this.setCreativeTab(DiscoveryCraft.tabDC)
            .setUnlocalizedName(Strings.SPECIAL_FLINT_SHOVEL_NAME);
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player)
    {
        if (player.worldObj.getBlockId(X, Y, Z) == Block.gravel.blockID)
        {
            Random rand = new Random();
            int temp = (int) rand.nextInt(2);
            
            if (temp == 0)
                ItemUtil.spawnItemOnGround(player.worldObj, X, Y, Z, 1, player, new ItemStack(Item.flint));
            else
                ItemUtil.spawnItemOnGround(player.worldObj, X, Y, Z, 1, player, new ItemStack(Block.gravel));
        
            itemstack.damageItem(1, player);
            player.worldObj.setBlockToAir(X, Y, Z);
            player.playSound("dig.gravel", 1, 1);
            //player.worldObj.spawnParticle(par1Str, X, Y, Z, par8, par10, par12);
            
            return true;
        }
        else if (player.worldObj.getBlockId(X, Y, Z) == Block.dirt.blockID || player.worldObj.getBlockId(X, Y, Z) == Block.grass.blockID)
        {
            Random rand = new Random();
            int temp = (int) rand.nextInt(5);
            
            if (temp == 0)
                ItemUtil.spawnItemOnGround(player.worldObj, X, Y, Z, 1, player, new ItemStack(Item.flint));
            else
                ItemUtil.spawnItemOnGround(player.worldObj, X, Y, Z, 1, player, new ItemStack(Block.dirt));
        
            itemstack.damageItem(1, player);
            player.worldObj.setBlockToAir(X, Y, Z);
            player.playSound("dig.grass", 1, 1);
            
            return true;
        }
        else if (player.worldObj.getBlockId(X, Y, Z) == Block.sand.blockID)
        {
            Random rand = new Random();
            int temp = (int) rand.nextInt(10);
            
            if (temp == 0)
                ItemUtil.spawnItemOnGround(player.worldObj, X, Y, Z, 1, player, new ItemStack(Item.flint));
            else
                ItemUtil.spawnItemOnGround(player.worldObj, X, Y, Z, 1, player, new ItemStack(Block.sand));
        
            itemstack.damageItem(1, player);
            player.worldObj.setBlockToAir(X, Y, Z);
            player.playSound("dig.sand", 1, 1);
            
            return true;
        }
        else
            return false;
    }
}
