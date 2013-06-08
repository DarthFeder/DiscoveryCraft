package mods.minecraft.darth.dc.core.handlers;

import java.util.EnumSet;

import mods.minecraft.darth.dc.core.util.KeyBindingUtil;
import mods.minecraft.darth.dc.lib.Reference;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.common.TickType;

public class KeyBindingHandler extends KeyBindingRegistry.KeyHandler
{

    public KeyBindingHandler()
    {
        super(KeyBindingUtil.gatherKeyBindings(), KeyBindingUtil.gatherIsRepeating());
    }

    @Override
    public String getLabel()
    {
        return Reference.MOD_NAME + ": " + this.getClass().getSimpleName();
    }

    @Override
    public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat)
    {
        
        /* Only operate at the end of the tick
        if (tickEnd)
        {
            // If we are not in a GUI of any kind, continue execution
            if (FMLClientHandler.instance().getClient().inGameHasFocus)
            {
                EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
                
                if (player != null)
                {
                    ItemStack currentItem = FMLClientHandler.instance().getClient().thePlayer.getCurrentEquippedItem();


                    if (currentItem != null)
                    {
                        if (currentItem.getItem() instanceof IKeyBound)
                        {
                            if (!KeyBindingUtil.isClientSided(kb.keyDescription))
                            {
                                PacketDispatcher.sendPacketToServer(PacketTypeHandler.populatePacket(new PacketKeyPressed(kb.keyDescription)));
                            }
                            else
                            {
                                ((IKeyBound) currentItem.getItem()).doKeyBindingAction(player, currentItem, kb.keyDescription);
                            }
                        }
                    }
                }
            }
        }*/
        
    }

    @Override
    public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public EnumSet<TickType> ticks()
    {
        return EnumSet.of(TickType.CLIENT);
    }

}
