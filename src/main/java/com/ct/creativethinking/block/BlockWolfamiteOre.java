package com.ct.creativethinking.block;


public class BlockWolfamiteOre extends BlockCT
{
    public BlockWolfamiteOre()

    {
        super();
        this.setBlockName("WolfamiteOre");
        this.setBlockTextureName("WolfamiteOre");
        this.setStepSound(soundTypeStone);
        this.setHardness(15.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

}

