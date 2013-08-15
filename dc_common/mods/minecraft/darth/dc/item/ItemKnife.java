package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.entity.projectile.EntityKnifeProjectile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemKnife extends SwordDC
{
	boolean melee;
	
    public ItemKnife(int id, EnumToolMaterial toolMaterial, boolean melee)
    {
        super(id, toolMaterial);
        this.setCreativeTab(DiscoveryCraft.tabDC);
        
        this.melee = melee;
        
        if(melee)
        {
        	this.setMaxStackSize(1)
    		    .setMaxDamage(14);
        }
        else
        {
        	this.setMaxStackSize(8)
        		.setMaxDamage(-1);
        }
    }
    
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	if(!melee)
    	{
	        boolean flag = par3EntityPlayer.capabilities.isCreativeMode;
	
	        if (flag || par3EntityPlayer.inventory.hasItem(ModItems.knifeThrowing.itemID))
	        {
	
	            EntityKnifeProjectile entityknife = new EntityKnifeProjectile(par2World, par3EntityPlayer, 1.0F);
	            
	            if(!flag)
	            {
	            	--par1ItemStack.stackSize;
	            	entityknife.canBePickedUp = 1;
	            }
	            
	            par2World.playSoundAtEntity(par3EntityPlayer, "random.pop", 1.0F, 1.0F);

	            entityknife.setDamage(2D);
	
	            if (!par2World.isRemote)
	            {
	                par2World.spawnEntityInWorld(entityknife);
	            }
	        }
	        
	        return par1ItemStack;
    	}
    	else
    	{
    		return par1ItemStack;
    	}
    }
}
