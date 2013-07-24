package mods.minecraft.darth.dc.block;

import java.util.Random;

import mods.minecraft.darth.dc.DiscoveryCraft;
import mods.minecraft.darth.dc.lib.GuiIDs;
import mods.minecraft.darth.dc.tileentity.TileScientificAssembler;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockScientificAssembler extends BlockDC
{
    private Random rand = new Random();

    public BlockScientificAssembler(int id)
    {
        super(id, Material.rock);
        this.setResistance(30)
            .setHardness(2)
            .setStepSound(soundAnvilFootstep);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world)
    {
        return new TileScientificAssembler();
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, int id, int meta)
    {
        dropInventory(world, x, y, z);
        super.breakBlock(world, x, y, z, id, meta);
    }
    
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if (player.isSneaking())
            return false;
        else
        {
            if (!world.isRemote)
            {
                TileScientificAssembler tile = (TileScientificAssembler) world.getBlockTileEntity(x, y, z);

                if (tile != null){
                	
                    player.openGui(DiscoveryCraft.instance, GuiIDs.ASSEMBLER1, world, x, y, z);
                    System.out.println(tile.toString());
                }
            }

            return true;
        }
    }

    
    private void dropInventory(World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);

        if (!(tileEntity instanceof IInventory))
            return;

        IInventory inventory = (IInventory) tileEntity;

        for (int i = 0; i < inventory.getSizeInventory(); i++)
        {
            ItemStack itemStack = inventory.getStackInSlot(i);

            if (itemStack != null && itemStack.stackSize > 0)
            {
                float dX = rand.nextFloat() * 0.8F + 0.1F;
                float dY = rand.nextFloat() * 0.8F + 0.1F;
                float dZ = rand.nextFloat() * 0.8F + 0.1F;

                EntityItem entityItem = new EntityItem(world, x + dX, y + dY, z + dZ, new ItemStack(itemStack.itemID, itemStack.stackSize, itemStack.getItemDamage()));

                if (itemStack.hasTagCompound())
                    entityItem.getEntityItem().setTagCompound((NBTTagCompound) itemStack.getTagCompound().copy());

                float factor = 0.05F;
                
                entityItem.motionX = rand.nextGaussian() * factor;
                entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
                entityItem.motionZ = rand.nextGaussian() * factor;
                
                world.spawnEntityInWorld(entityItem);
                itemStack.stackSize = 0;
            }
        }

    }

}
