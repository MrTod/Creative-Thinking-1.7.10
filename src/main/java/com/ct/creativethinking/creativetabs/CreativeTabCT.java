package com.ct.creativethinking.creativetabs;


import com.ct.creativethinking.init.ModItems;
import com.ct.creativethinking.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCT
{
    public static final CreativeTabs CT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.CTLOGO;
        }
    };
}