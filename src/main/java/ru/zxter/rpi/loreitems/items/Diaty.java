package ru.zxter.rpi.loreitems.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;
import ru.zxter.rpi.register.TabReg;

public class Diaty extends Item {
    public Diaty(String name, String texture){
        GameRegistry.registerItem(this,name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(TabReg.mytab);
        this.setMaxStackSize(1);
    }
}
