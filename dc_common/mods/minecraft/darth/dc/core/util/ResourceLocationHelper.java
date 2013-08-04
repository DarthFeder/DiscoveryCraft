package mods.minecraft.darth.dc.core.util;

import mods.minecraft.darth.dc.lib.Reference;
import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper
{
    public static ResourceLocation getResourceLocation(String path)
    {
        return new ResourceLocation(Reference.MOD_ID.toLowerCase(), path);
    }
}
