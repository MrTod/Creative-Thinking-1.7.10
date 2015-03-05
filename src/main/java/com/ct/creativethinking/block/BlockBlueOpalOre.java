package com.ct.creativethinking.block;

public class BlockBlueOpalOre extends BlockCT
{
    public BlockBlueOpalOre()

        {
            super();
            this.setBlockName("BlueOpalOre");
            this.setBlockTextureName("BlueOpalOre");
            this.setStepSound(soundTypeStone);
            this.setHardness(15.0F);
            this.setResistance(5.0F);
            this.setHarvestLevel("pickaxe", 2);
        }

    }



