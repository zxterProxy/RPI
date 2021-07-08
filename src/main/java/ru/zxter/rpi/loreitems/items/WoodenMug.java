package ru.zxter.rpi.loreitems.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.TabReg;

/**
 * Created by zxter on 08.07.2021.
 */
public class WoodenMug extends Item{
    public  WoodenMug (String name, String texture) {
        setUnlocalizedName(name);
        GameRegistry.registerItem(this, name);
        this.setCreativeTab(TabReg.mytab);
        this.setTextureName(main.MODID + ":" + texture);
        this.setMaxDamage(1);
        this.setMaxStackSize(1);

    }
}
