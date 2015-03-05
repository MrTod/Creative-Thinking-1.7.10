package com.ct.creativethinking;

import com.ct.creativethinking.entity.EntityScath;
import com.ct.creativethinking.handler.Entity;
import com.ct.creativethinking.handler.Fuel;
import com.ct.creativethinking.init.*;
import com.ct.creativethinking.proxy.IProxy;
import com.ct.creativethinking.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.Version)
public class CreativeThinking {

    @Mod.Instance("Reference.MOD_ID")
    public static CreativeThinking instance;

    @SidedProxy(clientSide = "com.ct.creativethinking.proxy.ClientProxy", serverSide = "com.ct.creativethinking.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

       ModItems.init();
       ModBlocks.init();
       ModWorldGeneration.init();
       Recipes.init();

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        GameRegistry.registerFuelHandler(new Fuel());
        Entity.registerMonsters(EntityScath.class, "Scath");


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}