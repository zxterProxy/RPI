package ru.zxter.rpi.register;

import net.minecraft.item.Item;
import ru.zxter.rpi.loreitems.food.CrescentGrass;

public class FoodReg {
    public static Item crescentgrass;
    public static void FoodReg(){

        crescentgrass = new CrescentGrass("crescentgrass", "moongrass", 10, 1F, true);
    }
}
