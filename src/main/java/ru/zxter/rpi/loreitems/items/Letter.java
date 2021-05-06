package ru.zxter.rpi.loreitems.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;

public class Letter extends Item {
    public Letter (String name, String texture){
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        setCreativeTab(CommonProxy.mytab);
        this.setMaxStackSize(1);
    }
}
