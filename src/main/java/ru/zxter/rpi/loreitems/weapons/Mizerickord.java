package ru.zxter.rpi.loreitems.weapons;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.StatCollector;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;

import java.util.List;

public class Mizerickord extends ItemSword {
    public Mizerickord (ToolMaterial Material, String name, String texture){
        super(Material);
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(CommonProxy.mytab);
        this.setMaxDamage(513);
    }
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.rare;
    }

    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(StatCollector.translateToLocal(""));
        par3List.add(StatCollector.translateToLocal("lore.rpi.mizerickord.0"));
        par3List.add(StatCollector.translateToLocal("lore.rpi.mizerickord.1"));
        par3List.add(StatCollector.translateToLocal("lore.rpi.mizerickord.2"));
        par3List.add(StatCollector.translateToLocal("lore.rpi.mizerickord.3"));

    }
}

