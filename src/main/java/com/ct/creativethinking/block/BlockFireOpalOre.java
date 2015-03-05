package com.ct.creativethinking.block;


public class BlockFireOpalOre extends BlockCT
{
    public BlockFireOpalOre()

    {
        super();
        this.setBlockName("FireOpalOre");
        this.setBlockTextureName("FireOpalOre");
        this.setStepSound(soundTypeStone);
        this.setHardness(15.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

}
