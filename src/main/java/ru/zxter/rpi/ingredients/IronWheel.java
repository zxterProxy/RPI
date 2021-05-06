package ru.zxter.rpi.ingredients;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;

public class IronWheel extends Item {
    public IronWheel(String name, String texture) {
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}
