package com.ct.creativethinking.init;

import com.ct.creativethinking.block.BlockCTLOGO;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {

        //Item Stacks
        ItemStack CTLOGO = new ItemStack(ModItems.CTLOGO);

        //Recipies

        //CTLOGO
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockCTLOGO),
                "aa ",
                "aa ",
                "aa ",
                'a', CTLOGO);

    }
}