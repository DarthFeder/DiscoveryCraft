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
        System.out.println("[DiscoveryCraft] Initiating custom dungeon additions...");
        
        DungeonHooks.addDungeonMob("creeper", 20);
        DungeonHooks.addDungeonMob("enderman", 10);
        DungeonHooks.addDungeonMob("witch", 5);
        DungeonHooks.addDungeonMob("snowman", 1);
        
        
        WeightedRandomChestContent notebookLockDungeonFind = new WeightedRandomChestContent(new ItemStack(ModItems.notebookLock), 5, 25, 3);
        
        ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, notebookLockDungeonFind);
        ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, notebookLockDungeonFind);
        ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, notebookLockDungeonFind);
        ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, notebookLockDungeonFind);
        ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR, notebookLockDungeonFind);
        ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CROSSING, notebookLockDungeonFind);
        ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH, notebookLockDungeonFind);
        
        System.out.println("[DiscoveryCraft] Finished adding dungeon additions.");
    }
    
}
