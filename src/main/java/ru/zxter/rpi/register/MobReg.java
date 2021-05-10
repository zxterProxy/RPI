package ru.zxter.rpi.register;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

/**
 * Created by zxter on 28.01.2021.
 */

public class MobReg {

    public static void MobReg(Class entityClass, String name, int primaryColor, int secondaryColor) {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        long seed = name.hashCode();

        EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
    }

}
