package ru.zxter.rpi.loreitems.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;

public class Sealedenvelope extends Item {
    public Sealedenvelope(String name, String texture) {
        GameRegistry.registerItem(this, name);
        setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setMaxStackSize(1);
        this.setCreativeTab(CommonProxy.mytab);

    }

}

