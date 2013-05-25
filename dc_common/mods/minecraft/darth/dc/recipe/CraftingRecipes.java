package mods.minecraft.darth.dc.recipe;

import mods.minecraft.darth.dc.item.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipes
{

    public static void init()
    {
        
        //Science Notebook
        GameRegistry.addRecipe(new ItemStack(ModItems.sciNotebook), "dld", "lbl", "dnd", 'd', new ItemStack(ModItems.unknownDust), 'b', new ItemStack(Item.writableBook), 'l', new ItemStack(Item.dyePowder), 'n', new ItemStack(ModItems.notebookLock));
        
        //Monocle Lens
        GameRegistry.addRecipe(new ItemStack(ModItems.monocleLens), "ggg", "gpg", "ggg", 'g', new ItemStack(Item.goldNugget), 'p', new ItemStack(Block.thinGlass));
    
        //Sonic Screwdriver
        GameRegistry.addRecipe(new ItemStack (ModItems.sonicScrewdriver), "e  ", " s ", "  i", 'e', new ItemStack(Item.emerald), 's', new ItemStack(Item.stick), 'i', new ItemStack(Item.ingotIron));
        
    }
    
}