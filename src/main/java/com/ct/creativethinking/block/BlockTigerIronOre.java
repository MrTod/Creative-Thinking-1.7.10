package com.ct.creativethinking.block;

public class BlockTigerIronOre extends BlockCT
{
    public BlockTigerIronOre()

    {
        super();
        this.setBlockName("TigerIronOre");
        this.setBlockTextureName("TigerIronOre");
        this.setStepSound(soundTypeStone);
        this.setHardness(15.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

}