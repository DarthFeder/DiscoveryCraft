package mods.minecraft.darth.dc.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.Sounds;
import mods.minecraft.darth.dc.lib.Strings;

public class ItemSonicScrewdriver extends ItemDC
{

    public ItemSonicScrewdriver(int id)
    {
        super(id);
        this.setCreativeTab(DiscoveryCraft.tabDC)
            .setUnlocalizedName(Strings.SONIC_SCREWDRIVER_NAME);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("§c§oDiscoveryCraft Edition");
        
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        playScrewdriverSound(par3EntityPlayer, par2World);
        return par1ItemStack;
    }
    
    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        
        if (par3World.getBlockId(par4, par5,par6) == Block.tnt.blockID && !par3World.isRemote)
        {
            EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(par3World, (double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), par2EntityPlayer);
            par3World.spawnEntityInWorld(entitytntprimed);
            par3World.playSoundAtEntity(entitytntprimed, "random.fuse", 1.0F, 1.0F);
            par3World.setBlockToAir(par4, par5, par6);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.redstoneLampIdle.blockID)
        {
            par3World.setBlock(par4, par5, par6, Block.redstoneLampActive.blockID);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.redstoneLampActive.blockID)
        {
            par3World.setBlock(par4, par5, par6, Block.redstoneLampIdle.blockID);
        }
        else if (par3World.getBlockMaterial(par4, par5, par6) == Material.wood)
        {
            par3World.getClosestPlayer(par4, par5, par6, 10).spawnExplosionParticle();
            par3World.playSoundEffect((double) par4 + 0.5D, (double) par5 + 0.5D, (double) par6 + 0.5D, "random.fizz", 1.0F, par3World.rand.nextFloat() * 0.1F + 0.9F);
            return true;
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.sand.blockID)
        {
            if (par2EntityPlayer.isSneaking())
                par3World.setBlock(par4, par5, par6, Block.glass.blockID);
            else
                par3World.setBlock(par4, par5, par6, Block.sandStone.blockID);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.sandStone.blockID)
        {
            if (par2EntityPlayer.isSneaking())
                par3World.setBlock(par4, par5, par6, Block.glass.blockID);
            else
                par3World.setBlock(par4, par5, par6, Block.sand.blockID);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.glass.blockID)
        {
            if (par2EntityPlayer.isSneaking())
                par3World.setBlock(par4, par5, par6, Block.sand.blockID);
            else
                par3World.setBlock(par4, par5, par6, Block.thinGlass.blockID);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.thinGlass.blockID)
        {
            if (par2EntityPlayer.isSneaking())
                par3World.setBlock(par4, par5, par6, Block.sand.blockID);
            else
                par3World.setBlock(par4, par5, par6, Block.glass.blockID);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.anvil.blockID && par3World.getBlockMetadata(par4, par5, par6) == 2)
        {
            par3World.setBlockMetadataWithNotify(par4, par5, par6, 1, 2);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.anvil.blockID && par3World.getBlockMetadata(par4, par5, par6) == 1)
        {
            par3World.setBlockMetadataWithNotify(par4, par5, par6, 0, 2);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.dirt.blockID)
        {
            par3World.setBlock(par4, par5, par6, Block.grass.blockID);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.grass.blockID)
        {
            par3World.setBlock(par4, par5, par6, Block.dirt.blockID);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.stone.blockID)
        {
            par3World.setBlock(par4, par5, par6, Block.cobblestone.blockID);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.cobblestone.blockID)
        {
            par3World.setBlock(par4, par5, par6, Block.stone.blockID);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.pumpkin.blockID)
        {
            if (par2EntityPlayer.isSneaking())
            {
                if (par3World.getBlockMetadata(par4, par5, par6) != 3)
                    par3World.setBlockMetadataWithNotify(par4, par5, par6, par3World.getBlockMetadata(par4, par5, par6) + 1, 2);
                else
                    par3World.setBlockMetadataWithNotify(par4, par5, par6, 0, 2);
            }
            else
                par3World.setBlock(par4, par5, par6, Block.pumpkinLantern.blockID, par3World.getBlockMetadata(par4, par5, par6), 2);
        }
            
        else if (par3World.getBlockId(par4, par5,par6) == Block.pumpkinLantern.blockID)
        {
            if (par2EntityPlayer.isSneaking())
            {
                if (par3World.getBlockMetadata(par4, par5, par6) != 3)
                    par3World.setBlockMetadataWithNotify(par4, par5, par6, par3World.getBlockMetadata(par4, par5, par6) + 1, 2);
                else
                    par3World.setBlockMetadataWithNotify(par4, par5, par6, 0, 2);
            }
            else
                par3World.setBlock(par4, par5, par6, Block.pumpkin.blockID, par3World.getBlockMetadata(par4, par5, par6), 2);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.pistonBase.blockID)
        {
            if (par2EntityPlayer.isSneaking())
            {
                if (par3World.getBlockMetadata(par4, par5, par6) != 5)
                    par3World.setBlockMetadataWithNotify(par4, par5, par6, par3World.getBlockMetadata(par4, par5, par6) + 1, 2);
                else
                    par3World.setBlockMetadataWithNotify(par4, par5, par6, 0, 2);
            }
            else
                par3World.setBlock(par4, par5, par6, Block.pistonStickyBase.blockID, par3World.getBlockMetadata(par4, par5, par6), 2);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.pistonStickyBase.blockID)
        {
            if (par2EntityPlayer.isSneaking())
            {
                if (par3World.getBlockMetadata(par4, par5, par6) != 5)
                    par3World.setBlockMetadataWithNotify(par4, par5, par6, par3World.getBlockMetadata(par4, par5, par6) + 1, 2);
                else
                    par3World.setBlockMetadataWithNotify(par4, par5, par6, 0, 2);
            }
            else
                par3World.setBlock(par4, par5, par6, Block.pistonBase.blockID, par3World.getBlockMetadata(par4, par5, par6), 2);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.leaves.blockID)
        {
            par3World.playSoundEffect((double) par4 + 0.5D, (double) par5 + 0.5D, (double) par6 + 0.5D, "random.break", 1.0F, 1.0F);
            par3World.setBlockToAir(par4, par5, par6);
        }
        else
        {
            return super.onItemUse(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10);
        }
        
        return false;
        
    }
    
    public boolean itemInteractionForEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving)
    {
        if (par2EntityLiving instanceof EntityEnderman)
        {
            par2EntityLiving.travelToDimension(-1);
        }
        else if (par2EntityLiving instanceof EntityCreeper)
        {
            ((EntityCreeper) par2EntityLiving).setCreeperState(-1);  
        }
        
        return false;
    }
    
    private static void playScrewdriverSound(EntityPlayer player, World world)
    {
        world.playSoundAtEntity(player, Sounds.SOUND_SONIC_SCREWDRIVER , 1.0F, 1.0F);
    }
    
}
