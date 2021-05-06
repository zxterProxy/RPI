package ru.zxter.rpi.register;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import ru.zxter.rpi.loreitems.equipment.RustyPickaxe;

public class ToolsReg {

    public static Item rustypickaxe;
    public static final Item.ToolMaterial rust = EnumHelper.addToolMaterial("RUST", 2, 279, 12.0F, 5.0F, 100);

    public static void ToolsReg() {

        rustypickaxe = new RustyPickaxe(rust, "rustypickaxe", "rustypickaxe");
    }
}
