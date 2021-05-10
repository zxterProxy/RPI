package ru.zxter.rpi.loreitems.equipment;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemPickaxe;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.TabReg;

public class RustyPickaxe extends ItemPickaxe {
    public RustyPickaxe(ToolMaterial material, String name, String texture) {
        super(material);
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(TabReg.mytab);
    }
}
