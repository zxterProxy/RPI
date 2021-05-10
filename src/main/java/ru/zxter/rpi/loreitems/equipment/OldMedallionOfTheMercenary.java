package ru.zxter.rpi.loreitems.equipment;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.TabReg;

public class OldMedallionOfTheMercenary extends Item {
    public OldMedallionOfTheMercenary(String name, String texture) {
        GameRegistry.registerItem(this, name);
        setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(TabReg.mytab);
    }
}
