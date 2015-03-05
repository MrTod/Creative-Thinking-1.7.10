package com.ct.creativethinking.block;

public class BlockJadeOre extends BlockCT
{
    public BlockJadeOre()

    {
        super();
        this.setBlockName("JadeOre");
        this.setBlockTextureName("JadeOre");
        this.setStepSound(soundTypeStone);
        this.setHardness(15.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

}