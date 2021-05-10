package ru.zxter.rpi.loreitems.weapons;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;
import org.lwjgl.opengl.GL11;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;
import ru.zxter.rpi.register.TabReg;

public class BluntedRapier extends ItemSword {
    public BluntedRapier(ToolMaterial material, String name, String texture) {
        super(material);
        GameRegistry.registerItem(this, name);
        setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(TabReg.mytab);
    }

}