package ru.zxter.rpi.loreitems.weapons;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.TabReg;

/**
 * Created by zxter on 24.04.2021.
 */
public class Flamberg extends ItemSword {
    public Flamberg(ToolMaterial Material, String name, String texture) {
        super(Material);
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(TabReg.bosstab);
        this.setMaxDamage(513);
    }
}