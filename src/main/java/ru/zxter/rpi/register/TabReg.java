package ru.zxter.rpi.register;

import net.minecraft.creativetab.CreativeTabs;
import ru.zxter.rpi.ctabs.BossTab;
import ru.zxter.rpi.ctabs.FoodTab;
import ru.zxter.rpi.ctabs.MyTab;
import ru.zxter.rpi.ctabs.RPIingredients;
import ru.zxter.rpi.main;

/**
 * Created by zxter on 10.05.2021.
 */
public class TabReg {

    public static CreativeTabs mytab = new MyTab(main.MODID);
    public static CreativeTabs bosstab = new BossTab("RPIBoss");
    public static CreativeTabs rpiingredients = new RPIingredients("RPIIngredients");
    public static CreativeTabs foodtab = new FoodTab("RPISupplies");

    public static void init() {

    }
}
