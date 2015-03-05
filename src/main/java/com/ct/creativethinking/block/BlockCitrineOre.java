package com.ct.creativethinking.block;

public class BlockCitrineOre extends BlockCT
{
    public BlockCitrineOre()

    {
        super();
        this.setBlockName("CitrineOre");
        this.setBlockTextureName("CitrineOre");
        this.setStepSound(soundTypeStone);
        this.setHardness(15.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

}