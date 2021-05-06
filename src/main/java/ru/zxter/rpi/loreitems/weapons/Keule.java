package ru.zxter.rpi.loreitems.weapons;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;

/**
 * Created by zxter on 25.04.2021.
 */
public class Keule extends ItemSword {
    public Keule(ToolMaterial Material, String name, String texture) {
        super(Material);
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(CommonProxy.bosstab);
        this.setMaxDamage(513);
}
}