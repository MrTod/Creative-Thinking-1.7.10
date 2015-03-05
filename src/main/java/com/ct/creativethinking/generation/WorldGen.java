package com.ct.creativethinking.generation;


import com.ct.creativethinking.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGen implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateEnd(World world, Random random, int x, int z) {
    }

    private void generateSurface(World world, Random random, int x, int z) {
        for (int i = 0; i < 25; i++) {
            int chunkX = x + random.nextInt(16);
            int chunkY = random.nextInt(64);// 30 is Height
            int chunkZ = z + random.nextInt(16);

            (new WorldGenMinable(ModBlocks.FireOpalOre, 20)).generate(world, random, chunkX, chunkY, chunkZ);
            (new WorldGenMinable(ModBlocks.BlueOpalOre, 20)).generate(world, random, chunkX, chunkY, chunkZ);
            (new WorldGenMinable(ModBlocks.PurpleOpalOre, 3)).generate(world, random, chunkX, chunkY, chunkZ);
            (new WorldGenMinable(ModBlocks.WolfamiteOre, 3)).generate(world, random, chunkX, chunkY, chunkZ);
            (new WorldGenMinable(ModBlocks.JadeOre, 3)).generate(world, random, chunkX, chunkY, chunkZ);
            (new WorldGenMinable(ModBlocks.AquamarineOre, 3)).generate(world, random, chunkX, chunkY, chunkZ);
            (new WorldGenMinable(ModBlocks.GarnetOre, 3)).generate(world, random, chunkX, chunkY, chunkZ);
            (new WorldGenMinable(ModBlocks.TourmalineOre, 3)).generate(world, random, chunkX, chunkY, chunkZ);
            (new WorldGenMinable(ModBlocks.CitrineOre, 3)).generate(world, random, chunkX, chunkY, chunkZ);
            (new WorldGenMinable(ModBlocks.TigerIronOre, 3)).generate(world, random, chunkX, chunkY, chunkZ);

        }
    }

    private void generateNether(World world, Random random, int x, int z)
    {

    }
        //for (int i = 0; i < 25; i++)
            //int chunkX = x + random.nextInt(16);
            //int chunkY = random.nextInt(100);// 30 is Height
            //int chunkZ = z + random.nextInt(16);

            //(new WorldGenMinable(ModBlocks.FireOpalOre, 50)).generate(world, random, chunkX, chunkY, chunkZ);


}