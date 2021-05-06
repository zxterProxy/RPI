package ru.zxter.rpi.armor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;

public class MercenaryArmor extends ItemArmor {
    private String texturePath = main.MODID + ":" + "textures/model/armor/";

    public MercenaryArmor(ArmorMaterial armorMaterial, int renderIndex, int i, String name, String texture) {
        super(armorMaterial, renderIndex, i);
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CommonProxy.mytab);
        this.setMaxStackSize(1);
        this.setTextureName();


    }

    public void setTextureName() {
        if (armorType == 0 || armorType == 1 || armorType == 3) {
            this.texturePath += "MercenaryArmor_" + 1 + ".png";
        } else {
            this.texturePath += "MercenaryArmor_" + 2 + ".png";
        }
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
        return this.texturePath;
    }
}
