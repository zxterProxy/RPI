package ru.zxter.rpi.loreitems.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.TabReg;

/**
 * Created by zxter on 08.07.2021.
 */
public class GoodBowl extends Item {
    public GoodBowl(String name, String texture) {
        GameRegistry.registerItem(this, name);
        setUnlocalizedName(name);
        setTextureName(main.MODID + ":" + texture);
        setCreativeTab(TabReg.mytab);
    }
}