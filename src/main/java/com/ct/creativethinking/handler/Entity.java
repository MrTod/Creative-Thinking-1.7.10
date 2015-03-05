package com.ct.creativethinking.handler;

import com.ct.creativethinking.reference.Reference;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.Random;

public class Entity
{

    public static void registerMonsters(Class entityClass, String name){
        int entityId = EntityRegistry.findGlobalUniqueEntityId();
        long x = name.hashCode();
        Random random = new Random(x);
        int mainColor = random.nextInt() * 16777215;
        int subColor = random.nextInt() * 16777215;


        //Blocks away it can spawn =64
        EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
        EntityRegistry.addSpawn(entityClass, 100, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach,BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.coldBeach,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.desert,BiomeGenBase.desertHills,BiomeGenBase.extremeHills,BiomeGenBase.extremeHillsEdge,BiomeGenBase.extremeHillsPlus,BiomeGenBase.forest,BiomeGenBase.iceMountains,BiomeGenBase.icePlains,BiomeGenBase.jungle,BiomeGenBase.jungleEdge,BiomeGenBase.jungleHills,BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.mesa,BiomeGenBase.mesaPlateau,BiomeGenBase.plains,BiomeGenBase.roofedForest,BiomeGenBase.savanna,BiomeGenBase.savannaPlateau,BiomeGenBase.stoneBeach,BiomeGenBase.swampland,BiomeGenBase.taiga,BiomeGenBase.taigaHills);
        EntityRegistry.registerModEntity(entityClass, name, entityId, Reference.MOD_ID, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, mainColor, subColor));
    }
}
