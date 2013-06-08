package mods.minecraft.darth.dc.block;

import net.minecraft.block.material.Material;

public class BlockScientificAssembler extends BlockDC
{

    public BlockScientificAssembler(int id)
    {
        super(id, Material.rock);
        this.setResistance(30)
            .setHardness(2)
            .setStepSound(soundAnvilFootstep);
    }

}
