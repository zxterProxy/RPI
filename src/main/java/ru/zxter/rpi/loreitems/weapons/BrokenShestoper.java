package ru.zxter.rpi.loreitems.weapons;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;

public class BrokenShestoper extends ItemSword {
    public BrokenShestoper(ToolMaterial material, String name, String texture) {
        super(material);
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CommonProxy.mytab);
        this.setTextureName(main.MODID + ":" + texture);
    }
}
