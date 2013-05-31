package mods.minecraft.darth.dc.client.audio;

import java.util.logging.Level;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import mods.minecraft.darth.dc.core.util.LogUtil;
import mods.minecraft.darth.dc.lib.Sounds;

public class SoundHandler
{

    @ForgeSubscribe
    public void onSoundLoad(SoundLoadEvent event)
    {
        
       // For each custom sound file we have defined in Sounds
        for (String soundFile : Sounds.soundFiles)
        {
            // Add the custom sound file to the pool of sounds
            try
            {
                event.manager.soundPoolSounds.addSound(soundFile, this.getClass().getResource("/" + soundFile));
            }
            catch (Exception e)
            {
                LogUtil.log(Level.WARNING, "Failed to load sound file: " + soundFile);
            }
        }
        
        LogUtil.log(Level.INFO, "Succesfully loaded sound files.");
    }
}
