package com.ct.creativethinking.block;

public class BlockTourmalineOre extends BlockCT
{
    public BlockTourmalineOre()

    {
        super();
        this.setBlockName("TourmalineOre");
        this.setBlockTextureName("TourmalineOre");
        this.setStepSound(soundTypeStone);
        this.setHardness(15.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

}