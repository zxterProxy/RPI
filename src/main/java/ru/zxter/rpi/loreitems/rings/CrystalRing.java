package ru.zxter.rpi.loreitems.rings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;

import java.util.List;

public class CrystalRing extends Item {
    private ItemStack itemStack;

    public CrystalRing(String name, String texture) {
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setMaxStackSize(1);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(CommonProxy.mytab);
        this.setMaxDamage(100);


    }


    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack) {
        return true;
    }


    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.rare;
    }

    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(StatCollector.translateToLocal(""));
    }

    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
        super.onUpdate(par1ItemStack, par2World, par3Entity, par4, par5);
        EntityPlayer player = (EntityPlayer) par3Entity;

        for (int i = 0; i < 9; ++i) {
            if (player.inventory.getStackInSlot(i) == par1ItemStack) {
                this.doEffect(player, par1ItemStack);
                break;
            }
        }
    }


    public void doEffect(EntityPlayer player, ItemStack item) {
        player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 0, 0));
    }
}

