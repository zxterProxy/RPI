package ru.zxter.rpi.loreitems.weapons;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemBow;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;
import ru.zxter.rpi.register.TabReg;

public class BrokenLittleCrossbow extends ItemBow {
    private Minecraft mc;

    public BrokenLittleCrossbow(String name, String texture) {
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setFull3D();
        this.setCreativeTab(TabReg.mytab);


    }
}
