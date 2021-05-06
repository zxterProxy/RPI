package ru.zxter.rpi;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.zxter.rpi.register.LoreItemsReg;
import ru.zxter.rpi.register.WeaponReg;

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
            return (WeaponReg.flamberg);

        }
    }


