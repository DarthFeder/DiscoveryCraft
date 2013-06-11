package mods.minecraft.darth.dc.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.BlockIDs;
import mods.minecraft.darth.dc.lib.Strings;

public class ItemCraftingUpgrade extends ItemDC
{

    public ItemCraftingUpgrade(int id)
    {
        super(id);
        this.setCreativeTab(DiscoveryCraft.tabDC)
            .setUnlocalizedName(Strings.CRAFTING_UPGRADE_NAME);
    }

    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (world.getBlockId(par4, par5, par6) == Block.workbench.blockID)
        {
            world.setBlock(par4, par5, par6, BlockIDs.SCIENTIFIC_ASSEMBLER);
            --par1ItemStack.stackSize;
        }
        
        return false;
    }
}
