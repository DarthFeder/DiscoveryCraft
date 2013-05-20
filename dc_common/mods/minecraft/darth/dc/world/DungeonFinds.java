package mods.minecraft.darth.dc.world;

import mods.minecraft.darth.dc.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;

public class DungeonFinds
{

    public static void initDungeon()
    {
        
        DungeonHooks.addDungeonMob("creeper", 15);
        
        
        WeightedRandomChestContent notebookLockDungeonFind = new WeightedRandomChestContent(new ItemStack(ModItems.notebookLock), 2, 20, 3);
        
        ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, notebookLockDungeonFind);
        ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, notebookLockDungeonFind);
        ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, notebookLockDungeonFind);
        ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, notebookLockDungeonFind);
        ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR, notebookLockDungeonFind);
        ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CROSSING, notebookLockDungeonFind);
        ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH, notebookLockDungeonFind);
        
    }
    
}
