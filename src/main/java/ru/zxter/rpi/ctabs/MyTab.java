package ru.zxter.rpi.ctabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.LoreItemsReg;

public class MyTab extends CreativeTabs {

    private static final Object MODID = main.MODID;

    public MyTab(String lable) {
        super(lable);
    }

    @Override
    public Item getTabIconItem() {
        return (LoreItemsReg.distortedholyscripture);

    }
}
