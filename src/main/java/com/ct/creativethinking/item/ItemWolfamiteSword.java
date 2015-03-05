package com.ct.creativethinking.item;

import com.ct.creativethinking.creativetabs.CreativeTabCT;
import com.ct.creativethinking.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemWolfamiteSword extends ItemSword
{
    public ItemWolfamiteSword(ToolMaterial material)
    {
        super(material);
        this.setCreativeTab(CreativeTabCT.CT_TAB);
        this.setUnlocalizedName("WolfamiteSword");
        this.setTextureName(Reference.MOD_ID + "CT");
    }

}
