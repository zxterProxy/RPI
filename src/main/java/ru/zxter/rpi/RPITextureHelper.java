package ru.zxter.rpi;

import com.google.common.collect.Maps;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

/**
 * Created by zxter on 08.05.2021.
 */
public class RPITextureHelper {
    private static final Map resourceList = Maps.newHashMap();

    public RPITextureHelper() {
    }

    public static ResourceLocation getResource(String directory) {
        ResourceLocation resourcelocation = (ResourceLocation) resourceList.get(directory);
        if (resourcelocation == null) {
            resourcelocation = new ResourceLocation("rpi", directory);
            resourceList.put(directory, resourcelocation);
        }

        return resourcelocation;
    }

}


