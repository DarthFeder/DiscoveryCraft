package mods.minecraft.darth.dc.core.util;

import java.util.ArrayList;

import net.minecraft.client.settings.KeyBinding;

public class KeyBindingUtil
{
    public static ArrayList<KeyBinding> keyBindingsList;
    public static ArrayList<Boolean> isRepeatingList;
    
    public static void addKeyBinding(String name, int value)
    {
        if (keyBindingsList == null)
        {
            keyBindingsList = new ArrayList<KeyBinding>();
        }

        keyBindingsList.add(new KeyBinding(name, value));
    }


    public static void addIsRepeating(boolean value)
    {
        if (isRepeatingList == null)
        {
            isRepeatingList = new ArrayList<Boolean>();
        }

        isRepeatingList.add(value);
    }


    public static KeyBinding[] gatherKeyBindings()
    {
        return keyBindingsList.toArray(new KeyBinding[keyBindingsList.size()]);
    }


    public static boolean[] gatherIsRepeating()
    {
        boolean[] isRepeating = new boolean[isRepeatingList.size()];

        for (int x = 0; x < isRepeating.length; x++)
        {
            isRepeating[x] = isRepeatingList.get(x).booleanValue();
        }

        return isRepeating;
    }


    /* TODO Still not ideal, won't work for every case. Specifically, make it context sensitive
    public static boolean isClientSided(String keybinding)
    {
        if (keybinding.equalsIgnoreCase(ConfigurationSettings.KEYBINDING_TOGGLE))
            return true;
        else
            return false;
    }*/

}
