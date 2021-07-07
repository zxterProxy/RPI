package ru.zxter.rpi.register;

import net.minecraft.item.Item;
import ru.zxter.rpi.loreitems.drinks.*;

public class DrinksReg {

    public static Item wine,ale,mead,cider,beer,brandy,mulled_wine,berrytincture,wyvern_breath;


    public static void DrinksReg() {

        wine = new Wine("wine","drink_0");
        ale = new Ale("ale","drink_1");
        mead = new Mead("mead","drink_2");
        cider = new Cider("cider","drink_3");
        beer = new Beer("beer","drink_4");
        brandy = new Brandy("brandy","drink_5");
        mulled_wine = new Mulledwine("mulled_wine","drink_6");
        berrytincture = new BerrytIncture("berryt_incture","drink_7");
        wyvern_breath = new WyvernBreath("wyvern_breath","drink_8");
    }
}