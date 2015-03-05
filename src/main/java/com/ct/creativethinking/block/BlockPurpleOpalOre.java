package com.ct.creativethinking.block;


public class BlockPurpleOpalOre extends BlockCT
{
    public BlockPurpleOpalOre()

    {
        super();
        this.setBlockName("PurpleOpalOre");
        this.setBlockTextureName("PurpleOpalOre");
        this.setStepSound(soundTypeStone);
        this.setHardness(15.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

}