package ru.zxter.rpi.loreitems.drinks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.TabReg;

/**
 * Created by zxter on 08.07.2021.
 */
public class WyvernBreath extends Item{
    public WyvernBreath(String name, String texture) {
        setUnlocalizedName(name);
        GameRegistry.registerItem(this, name);
        this.setCreativeTab(TabReg.foodtab);
        this.setTextureName(main.MODID + ":drinks/" + texture);
        this.setMaxDamage(1);
        this.setMaxStackSize(1);

    }

    @Override
    public EnumAction getItemUseAction(ItemStack item) {
        return EnumAction.drink;
    }

    @Override
    public ItemStack onEaten(ItemStack item, World world, EntityPlayer player) {
        if (!world.isRemote)
        {
            player.curePotionEffects(new ItemStack(Items.milk_bucket));
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 200, 1));
            player.addPotionEffect(new PotionEffect(Potion.hunger.id, 300, 0));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 500, 0));
        }
        return item;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack item)
    {
        return 42;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
    {
        player.setItemInUse(item, this.getMaxItemUseDuration(item));
        return item;
    }
}

