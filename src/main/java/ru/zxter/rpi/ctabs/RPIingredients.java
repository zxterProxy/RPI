package ru.zxter.rpi.ctabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.IngredientsReg;

/**
 * Created by zxter on 10.05.2021.
 */
public class RPIingredients extends CreativeTabs {

    private static final Object MODID = main.MODID;

    public RPIingredients(String lable) {
        super(lable);
    }

    @Override
    public Item getTabIconItem() {
        return (IngredientsReg.thaumium);

    }
}
