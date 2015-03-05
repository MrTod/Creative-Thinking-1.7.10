package com.ct.creativethinking.block;

public class BlockGarnetOre extends BlockCT
{
    public BlockGarnetOre()

    {
        super();
        this.setBlockName("GarnetOre");
        this.setBlockTextureName("GarnetOre");
        this.setStepSound(soundTypeStone);
        this.setHardness(15.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

}