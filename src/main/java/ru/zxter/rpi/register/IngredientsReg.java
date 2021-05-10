package ru.zxter.rpi.register;

import net.minecraft.item.Item;
import ru.zxter.rpi.ingredients.IronWheel;
import ru.zxter.rpi.ingredients.Resin;
import ru.zxter.rpi.ingredients.Thaumium;
import ru.zxter.rpi.ingredients.Wismar;

public class IngredientsReg {
    public static Item resin;
    public static Item wismar;
    public static Item ironwheel;
    public static Item thaumium;


    public static void IngredientsReg() {

        resin = new Resin("resin", "resin");
        wismar = new Wismar("wismar", "wismar");
        ironwheel = new IronWheel("ironwheel", "iron_wheel");
        thaumium = new Thaumium("thaumium_prep", "thaumium_prep");
    }
}
