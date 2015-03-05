package com.ct.creativethinking.block;

public class BlockAquamarineOre extends BlockCT
{
    public BlockAquamarineOre()

    {
        super();
        this.setBlockName("AquamarineOre");
        this.setBlockTextureName("AquamarineOre");
        this.setStepSound(soundTypeStone);
        this.setHardness(15.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

}