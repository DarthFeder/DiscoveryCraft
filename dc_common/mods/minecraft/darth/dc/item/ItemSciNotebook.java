package mods.minecraft.darth.dc.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.minecraft.darth.dc.lib.Strings;

public class ItemSciNotebook extends ItemReadable
{

    public ItemSciNotebook(int id)
    {
        super(id);
        this.setUnlocalizedName(Strings.SCI_NOTEBOOK_NAME);
    }
    
    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer player, List par3List, boolean par4)
    {
        par3List.add(player.username);
        
    }

}
