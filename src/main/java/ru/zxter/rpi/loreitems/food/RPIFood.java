package ru.zxter.rpi.loreitems.food;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.TabReg;

/**
 * Created by zxter on 08.07.2021.
 */
public class RPIFood extends ItemFood {
    public RPIFood(String name, String texture, int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        GameRegistry.registerItem(this, name);
        this.setTextureName(main.MODID + ":Supplies/" + texture);
        this.setCreativeTab(TabReg.foodtab);
        this.setUnlocalizedName(name);
        this.setHasSubtypes(true);
        this.setAlwaysEdible();

    }

}

