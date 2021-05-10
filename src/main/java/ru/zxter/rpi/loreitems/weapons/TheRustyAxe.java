package ru.zxter.rpi.loreitems.weapons;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.TabReg;

public class TheRustyAxe extends ItemSword {
    public TheRustyAxe(ToolMaterial Material, String name, String texture) {
        super(Material);
        setUnlocalizedName(name);
        GameRegistry.registerItem(this, name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(TabReg.mytab);

    }

}
