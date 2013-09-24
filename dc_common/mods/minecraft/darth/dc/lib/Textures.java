package mods.minecraft.darth.dc.lib;

import mods.minecraft.darth.dc.core.util.ResourceLocationUtil;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;

public class Textures
{
    
    //General locations inside the mod
    public static final String GUI_SHEET_LOCATION = "textures/gui/";
    public static final String ARMOR_SHEET_LOCATION = Reference.MOD_ID.toLowerCase() + ":textures/armor/";
    
    //Helpful Vanilla GUIs
    public static final ResourceLocation VANILLA_BLOCK_TEXTURE_SHEET = TextureMap.locationBlocksTexture;
    public static final ResourceLocation VANILLA_ITEM_TEXTURE_SHEET = TextureMap.locationItemsTexture;
    public static final ResourceLocation VANILLA_INVENTORY = new ResourceLocation("textures/gui/container/inventory.png");
    public static final ResourceLocation VANILLA_FURNACE = new ResourceLocation("textures/gui/container/furnace.png");
    
    
    //GUIs
    public static final ResourceLocation GUI_SA1 = ResourceLocationUtil.getResourceLocation(GUI_SHEET_LOCATION + "SAInventory1.png");
    
    //Armor Sheets
    public static final String ARMOR_MONOCLE = ARMOR_SHEET_LOCATION + "MonocleArmorSheet.png";
    
}
