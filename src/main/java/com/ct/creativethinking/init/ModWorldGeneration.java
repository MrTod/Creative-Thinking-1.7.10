package com.ct.creativethinking.init;

import com.ct.creativethinking.generation.WorldGen;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorldGeneration
{
    public static WorldGen WorldGen = new WorldGen();

    public static void init()
    {
        GameRegistry.registerWorldGenerator(WorldGen, 1);
    }
}
