package mods.minecraft.darth.dc.event;

import net.minecraft.entity.player.EntityPlayer;

import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class PlayerDeathEvent
{

    @ForgeSubscribe (priority = EventPriority.NORMAL)
    public void LivingDeathEvent(LivingDeathEvent event)
    {
        if (!(event.entity instanceof EntityPlayer))
            return;
        
        
    }
}
