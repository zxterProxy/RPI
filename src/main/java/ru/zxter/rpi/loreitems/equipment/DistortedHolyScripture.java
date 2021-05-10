package ru.zxter.rpi.loreitems.equipment;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemWritableBook;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;
import ru.zxter.rpi.register.TabReg;

public class DistortedHolyScripture extends ItemWritableBook {
    public DistortedHolyScripture(String name, String texture) {
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(TabReg.mytab);
        this.setMaxStackSize(1);
    }
}
