package mods.minecraft.darth.dc.core.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.IMob;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class MobUtil
{
    
    /**
     * Will spawn a mob per given id at x, y, z in world par0World.
     * 
     * @param World
     * @param Entity Id
     * @param x
     * @param y
     * @param z
     * @return Entity
     */
    public static Entity spawnCreature(World par0World, int par1, double par2, double par4, double par6)
    {
            Entity entity = null;

            for (int j = 0; j < 1; ++j)
            {
                entity = EntityList.createEntityByID(par1, par0World);

                if (entity != null && entity instanceof EntityLiving)
                {
                    EntityLiving entityliving = (EntityLiving)entity;
                    entity.setLocationAndAngles(par2, par4, par6, MathHelper.wrapAngleTo180_float(par0World.rand.nextFloat() * 360.0F), 0.0F);
                    entityliving.rotationYawHead = entityliving.rotationYaw;
                    entityliving.renderYawOffset = entityliving.rotationYaw;
                    entityliving.initCreature();
                    par0World.spawnEntityInWorld(entity);
                    entityliving.playLivingSound();
                }
            }

            return entity;
    }
    
    
    /**
     * Will return whether or not given mob is a hostile mob.
     * 
     * @param Mob
     * @return true if hostile, false otherwise
     */
    public static boolean isHostileEntity(EntityLiving entity)
    {

        if (entity instanceof IMob)
            return true;
        else
            return false;
        
    }
    
    
}
