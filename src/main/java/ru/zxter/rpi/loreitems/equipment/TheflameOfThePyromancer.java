package ru.zxter.rpi.loreitems.equipment;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFlintAndSteel;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;

public class TheflameOfThePyromancer extends ItemFlintAndSteel {
    public TheflameOfThePyromancer(String name, String texture) {
        GameRegistry.registerItem(this, name);
        setUnlocalizedName(name);
        setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(CommonProxy.mytab);
        this.maxStackSize = 1;
        this.setMaxDamage(100);
    }

}
