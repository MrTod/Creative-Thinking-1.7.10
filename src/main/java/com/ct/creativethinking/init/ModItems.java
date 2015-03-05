package com.ct.creativethinking.init;

import com.ct.creativethinking.creativetabs.CreativeTabCT;
import com.ct.creativethinking.item.*;
import com.ct.creativethinking.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{

    //ModItem
    public static final ItemCT CTLOGO = new ItemCTLOGO();

    //Ingots
    public static final ItemCT FireOpalIngot = new ItemFireOpalIngot();
    public static final ItemCT BlueOpalIngot = new ItemBlueOpalIngot();
    public static final ItemCT PurpleOpalIngot = new ItemPurpleOpalIngot();
    public static final ItemCT WolfamiteIngot = new ItemWolfamiteIngot();
    public static final ItemCT JadeIngot = new ItemJadeIngot();
    public static final ItemCT AquamarineIngot = new ItemAquamarineIngot();
    public static final ItemCT GarnetIngot = new ItemGarnetIngot();
    public static final ItemCT TourmalineIngot = new ItemTourmalineIngot();
    public static final ItemCT CitrineIngot = new ItemCitrineIngot();
    public static final ItemCT TigerIronIngot = new ItemTigerIronIngot();

    //Fuel
    public static final ItemCT Briquette = new ItemBriquette();

    //Mobs

    //Scath Drops
    public static final ItemCT RawScathMeat = new ItemRawScathMeat();
    public static final ItemCT CookedScathMeat = new ItemCookedScathMeat();
    public static final ItemCT ScathPowder = new ItemScathPowder();


          public static void init()
      {

          //ModItem
          GameRegistry.registerItem(CTLOGO, "CTLOGO");

          //Ingots
          GameRegistry.registerItem(FireOpalIngot, "FireOpalIngot");
          GameRegistry.registerItem(BlueOpalIngot, "BlueOpalIngot");
          GameRegistry.registerItem(PurpleOpalIngot, "PurpleOpalIngot");
          GameRegistry.registerItem(WolfamiteIngot, "WolfamiteIngot");
          GameRegistry.registerItem(JadeIngot, "JadeIngot");
          GameRegistry.registerItem(AquamarineIngot, "AquamarineIngot");
          GameRegistry.registerItem(GarnetIngot, "GarnetIngot");
          GameRegistry.registerItem(TourmalineIngot, "TourmalineIngot");
          GameRegistry.registerItem(CitrineIngot, "CitrineIngot");
          GameRegistry.registerItem(TigerIronIngot, "TigerIronIngot");

          //Fuel
          GameRegistry.registerItem(Briquette, "Briquette");

          //Mobs

          //Scath
          GameRegistry.registerItem(RawScathMeat, "RawScathMeat");
          GameRegistry.registerItem(CookedScathMeat, "CookedScathMeat");
          GameRegistry.registerItem(ScathPowder, "ScathPowder");


      }
    }