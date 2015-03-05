package com.ct.creativethinking.init;


import com.ct.creativethinking.biome.BiomeFeatures.CTLeaf;
import com.ct.creativethinking.biome.BiomeFeatures.CTLog;
import com.ct.creativethinking.biome.BiomeFeatures.CTSapling;
import com.ct.creativethinking.block.*;
import com.ct.creativethinking.creativetabs.CreativeTabCT;
import com.ct.creativethinking.block.ItemLeafBlocks;
import com.ct.creativethinking.block.ItemLogBlocks;
import com.ct.creativethinking.block.ItemSaplingBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks
{

    //Tree
    public static Block blockLog;
    public static Block blockLeaf;
    public static Block blockSapling;

    //Ore
    public static final BlockFireOpalOre FireOpalOre = new BlockFireOpalOre();
    public static final BlockBlueOpalOre BlueOpalOre = new BlockBlueOpalOre();
    public static final BlockPurpleOpalOre PurpleOpalOre = new BlockPurpleOpalOre();
    public static final BlockWolfamiteOre WolfamiteOre = new BlockWolfamiteOre();
    public static final BlockJadeOre JadeOre = new BlockJadeOre();
    public static final BlockAquamarineOre AquamarineOre = new BlockAquamarineOre();
    public static final BlockGarnetOre GarnetOre = new BlockGarnetOre();
    public static final BlockTourmalineOre TourmalineOre = new BlockTourmalineOre();
    public static final BlockCitrineOre CitrineOre = new BlockCitrineOre();
    public static final BlockTigerIronOre TigerIronOre = new BlockTigerIronOre();

    //ModBlocks
    public static final BlockCTLOGO BlockCTLOGO = new BlockCTLOGO();



    //GAMEREGISTRY
    public static void init()
    {

        //Tree
        //Logs
        blockLog = new CTLog().setBlockName("Log").setCreativeTab(CreativeTabCT.CT_TAB);
        //Leafs
        blockLeaf = new CTLeaf().setBlockName("Leaf").setCreativeTab(CreativeTabCT.CT_TAB);
        //Saplings
        blockSapling = new CTSapling().setBlockName("Sapling").setCreativeTab(CreativeTabCT.CT_TAB);

        GameRegistry.registerBlock(blockLog, ItemLogBlocks.class, blockLog.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockLeaf, ItemLeafBlocks.class, blockLeaf.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockSapling, ItemSaplingBlocks.class, blockSapling.getUnlocalizedName().substring(5));

        //Ores
        GameRegistry.registerBlock(FireOpalOre, "FireOpalOre");
        GameRegistry.registerBlock(BlueOpalOre, "BlueOpalOre");
        GameRegistry.registerBlock(PurpleOpalOre, "PurpleOpalOre");
        GameRegistry.registerBlock(WolfamiteOre, "WolfamiteOre");
        GameRegistry.registerBlock(JadeOre, "JadeOre");
        GameRegistry.registerBlock(AquamarineOre, "AquamarineOre");
        GameRegistry.registerBlock(GarnetOre, "GarnetOre");
        GameRegistry.registerBlock(TourmalineOre, "TourmalineOre");
        GameRegistry.registerBlock(CitrineOre, "CirtineOre");
        GameRegistry.registerBlock(TigerIronOre, "TigerIronOre");

        //ModBlocks
        GameRegistry.registerBlock(BlockCTLOGO, "BlockCTLOGO");

    }
}
