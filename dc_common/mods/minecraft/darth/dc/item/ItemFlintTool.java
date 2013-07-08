package mods.minecraft.darth.dc.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.core.util.ItemUtil;

public class ItemFlintTool extends ItemDC
{

    public ItemFlintTool(int id)
    {
        super(id);
        this.setCreativeTab(DiscoveryCraft.tabDC)
            .setMaxDamage(55);
    }
    
    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
    {
        par1ItemStack.damageItem(2, par3EntityLiving);
        return true;
    }
    
    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving)
    {
        if ((double)Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D)
        {
            par1ItemStack.damageItem(1, par7EntityLiving);
        }

        return true;
    }
    
    public float getStrVsBlock(ItemStack itemStack, Block par2Block)
    {
        if (ItemUtil.compareIgnoreStackSize(itemStack, new ItemStack(ModItems.axeFlint)))
            return par2Block != null && (par2Block.blockMaterial == Material.wood || par2Block.blockMaterial == Material.plants || par2Block.blockMaterial == Material.vine) ? 4F : 1F;
        else if (ItemUtil.compareIgnoreStackSize(itemStack, new ItemStack(ModItems.pickaxeFlint)))
            return par2Block != null && (par2Block.blockMaterial == Material.anvil || par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.piston || par2Block.blockMaterial == Material.rock) ? 4F : 1F;
        else
            return par2Block != null && (par2Block.blockMaterial == Material.clay || par2Block.blockMaterial == Material.grass || par2Block.blockMaterial == Material.sand || par2Block.blockMaterial == Material.snow || par2Block.blockMaterial == Material.ground) ? 4F : 1F;
        
    }
    
}
