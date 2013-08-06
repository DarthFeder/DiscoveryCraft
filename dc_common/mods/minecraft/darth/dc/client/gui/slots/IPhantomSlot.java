package mods.minecraft.darth.dc.client.gui.slots;

/*
 * Phantom Slots don't "use" items, they are used for filters and various other logic slots.
 */
public interface IPhantomSlot
{
    boolean canAdjust();
}