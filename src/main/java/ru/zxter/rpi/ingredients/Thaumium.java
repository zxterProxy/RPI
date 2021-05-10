package ru.zxter.rpi.ingredients;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.TabReg;

/**
 * Created by zxter on 10.05.2021.
 */
public class Thaumium extends Item {
    public Thaumium (String name, String texture){
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(TabReg.rpiingredients);
    }
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.uncommon;
    }
}
