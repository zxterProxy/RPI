package ru.zxter.rpi.armor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.TabReg;

public class ClericArmor extends ItemArmor {
    private String texturePath = main.MODID + ":" + "textures/model/armor/";

    public ClericArmor(ArmorMaterial armorMaterial, int renderIndex, int i, String name, String texture) {
        super(armorMaterial, renderIndex, i);
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(TabReg.mytab);
        this.setMaxStackSize(1);
        this.setTextureName();


    }

    public void setTextureName() {
        if (armorType == 0 || armorType == 1 || armorType == 3) {
            this.texturePath += "ClericArmor_" + 1 + ".png";
        } else {
            this.texturePath += "ClericArmor_" + 2 + ".png";
        }
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
        return this.texturePath;
    }

    public boolean hasColor(ItemStack par1ItemStack) {
        return true;
    }

    public int getColor(ItemStack par1ItemStack) {
        NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();
        if (nbttagcompound == null) {
            return 16777215;
        } else {
            NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
            return nbttagcompound1.hasKey("color") ? nbttagcompound1.getInteger("color") : (nbttagcompound1 == null ? 6961280 : 6961280);
        }
    }

    public void removeColor(ItemStack par1ItemStack) {
        NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();
        if (nbttagcompound != null) {
            NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
            if (nbttagcompound1.hasKey("color")) {
                nbttagcompound1.removeTag("color");
            }
        }

    }

    public void func_82813_b(ItemStack par1ItemStack, int par2) {
        NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();
        if (nbttagcompound == null) {
            nbttagcompound = new NBTTagCompound();
            par1ItemStack.setTagCompound(nbttagcompound);
        }

        NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
        if (!nbttagcompound.hasKey("display")) {
            nbttagcompound.setTag("display", nbttagcompound1);
        }

        nbttagcompound1.setInteger("color", par2);
    }
}


