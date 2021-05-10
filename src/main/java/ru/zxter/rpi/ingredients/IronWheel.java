package ru.zxter.rpi.ingredients;

import cpw.mods.fml.common.registry.GameRegistry;
import minefantasy.mf2.item.list.CreativeTabMF;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.TabReg;

public class IronWheel extends Item {
    public IronWheel(String name, String texture) {
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(TabReg.rpiingredients);
    }
}
