package com.ct.creativethinking.handler;

import com.ct.creativethinking.init.ModItems;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class Fuel implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel) {

        if(fuel.getItem() == ModItems.Briquette) return 2000;
        return 0;
    }
}
