package ru.zxter.rpi.loreitems.weapons;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;

public class RuinedDagger extends ItemSword {
    public RuinedDagger(ToolMaterial Material, String name, String texture) {
        super(Material);
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(CommonProxy.mytab);
    }
}

