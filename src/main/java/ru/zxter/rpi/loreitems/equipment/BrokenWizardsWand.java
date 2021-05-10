package ru.zxter.rpi.loreitems.equipment;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;
import ru.zxter.rpi.register.TabReg;

public class BrokenWizardsWand extends Item {
    public BrokenWizardsWand(String name, String texture) {
        setUnlocalizedName(name);
        GameRegistry.registerItem(this, name);
        this.setCreativeTab(TabReg.mytab);
        this.setTextureName(main.MODID + ":" + texture);
        this.setFull3D();

    }
}
