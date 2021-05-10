package ru.zxter.rpi.ctabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.ItemReg;

/**
 * Created by zxter on 25.04.2021.
 */

public class BossTab extends CreativeTabs {

    private static final Object MODID = main.MODID;

    public BossTab(String lable) {
        super(lable);
    }

    @Override
    public Item getTabIconItem() {
        return (ItemReg.talkingsphere);

    }
}


