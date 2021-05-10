package ru.zxter.rpi.loreitems.rings;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;
import ru.zxter.rpi.register.TabReg;

import java.util.List;

public class RingPrincessOfTheSun extends Item implements IBauble {

    public RingPrincessOfTheSun(String name, String texture) {
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setMaxStackSize(1);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(TabReg.mytab);

    }

    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.rare;
    }

    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(StatCollector.translateToLocal(""));
        par3List.add(StatCollector.translateToLocal("lore.rpi.ringprincessofthesun.0"));
        par3List.add(StatCollector.translateToLocal("lore.rpi.ringprincessofthesun.1"));
        par3List.add(StatCollector.translateToLocal("lore.rpi.ringprincessofthesun.2"));
        par3List.add(StatCollector.translateToLocal("lore.rpi.ringprincessofthesun.3"));
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        return BaubleType.RING;
    }

    @Override
    public void onWornTick(ItemStack itemStack, EntityLivingBase entityLivingBase) {

    }

    @Override
    public void onEquipped(ItemStack itemStack, EntityLivingBase entityLivingBase) {

    }

    @Override
    public void onUnequipped(ItemStack itemStack, EntityLivingBase entityLivingBase) {

    }

    @Override
    public boolean canEquip(ItemStack itemStack, EntityLivingBase entityLivingBase) {
        return true;
    }

    @Override
    public boolean canUnequip(ItemStack itemStack, EntityLivingBase entityLivingBase) {
        return true;
    }


    @Override
        public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
            /**последний два значения(float/F) это: 1. Громкость, 2. Тональность звука. */
            player.playSound(main.MODID +":" + "ambient.test", 3.5F, 1.5F);
            return stack;
    }
}