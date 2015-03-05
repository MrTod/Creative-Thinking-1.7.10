package com.ct.creativethinking.block;

public class BlockCTLOGO extends BlockCT
{
    public BlockCTLOGO()
    {
        super();
        this.setBlockName("BlockCTLOGO");
        this.setBlockTextureName("BlockCTLOGO");
        this.setStepSound(soundTypeStone);
        this.setHardness(15.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

}
