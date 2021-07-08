package ru.zxter.rpi.ctabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.DrinksReg;

/**
 * Created by zxter on 08.07.2021.
 */
public class FoodTab extends CreativeTabs {

    private static final Object MODID = main.MODID;

    public FoodTab(String lable) {
        super(lable);
    }

    @Override
    public Item getTabIconItem() {
        return (DrinksReg.beer);

    }
}