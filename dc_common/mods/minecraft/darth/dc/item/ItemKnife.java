package mods.minecraft.darth.dc.item;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.entity.projectile.EntityKnifeProjectile;
import mods.minecraft.darth.dc.lib.Strings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemKnife extends ItemDC
{

    public ItemKnife(int id)
    {
        super(id);
        this.setCreativeTab(DiscoveryCraft.tabDC)
            .setUnlocalizedName(Strings.KNIFE_NAME)
            .setMaxStackSize(16);
    }
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {

        boolean flag = par3EntityPlayer.capabilities.isCreativeMode;

        if (flag || par3EntityPlayer.inventory.hasItem(ModItems.knife.itemID))
        {

            EntityKnifeProjectile entityknife = new EntityKnifeProjectile(par2World, par3EntityPlayer, 1.0F);

            --par1ItemStack.stackSize;
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F);
            
            
            
            entityknife.canBePickedUp = 1;

            entityknife.setDamage(0.1D);

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(entityknife);
            }
        }
        return par1ItemStack;
    }
}
