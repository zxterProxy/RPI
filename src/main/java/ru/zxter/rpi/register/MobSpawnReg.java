package ru.zxter.rpi.register;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import ru.zxter.rpi.mobs.Savage;

import java.util.ArrayList;
import java.util.List;


public class MobSpawnReg {

    public static void MobSpawnReg() {
        //Спавн Дикаря
        List<BiomeGenBase> biomes = new ArrayList<BiomeGenBase>();
        for(BiomeGenBase biome : BiomeGenBase.getBiomeGenArray()){
            if(biome != null){
                biomes.add(biome);
            }
        }
        EntityRegistry.addSpawn(Savage.class, 100, 6, 8, EnumCreatureType.monster, biomes.toArray(new BiomeGenBase[biomes.size()]));
    }

}