package mods.minecraft.darth.dc.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
        
        if (par3World.getBlockId(par4, par5,par6) == Block.tnt.blockID)
        {
            //playScrewdriverSound(par2EntityPlayer, par3World);
            
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.redstoneLampIdle.blockID)
        {
            //playScrewdriverSound(par2EntityPlayer, par3World);
            par3World.setBlock(par4, par5, par6, Block.redstoneLampActive.blockID);
        }
        else if (par3World.getBlockId(par4, par5,par6) == Block.redstoneLampActive.blockID)
        {
            //playScrewdriverSound(par2EntityPlayer, par3World);
            par3World.setBlock(par4, par5, par6, Block.redstoneLampIdle.blockID);
        }
        else if (par3World.getBlockMaterial(par4, par5, par6) == Material.wood)
        {
            par3World.getClosestPlayer(par4, par5, par6, 10).spawnExplosionParticle();
            par3World.playSoundEffect((double) par4 + 0.5D, (double) par5 + 0.5D, (double) par6 + 0.5D, "random.fizz", 1.0F, par3World.rand.nextFloat() * 0.1F + 0.9F);
            return true;
        }
        
        return false;
        
    }
    
    private static void playScrewdriverSound(EntityPlayer player, World world)
    {
        world.playSoundAtEntity(player, Sounds.SOUND_SONIC_SCREWDRIVER , 1.0F, 1.0F);
    }
    
}
