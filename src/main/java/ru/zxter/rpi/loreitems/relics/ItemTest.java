package ru.zxter.rpi.loreitems.relics;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import electroblob.wizardry.spell.Spell;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.TabReg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zxter on 19.04.2022.
 */
public class ItemTest extends Item {
    public ItemTest ( String name, String texture) {
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(TabReg.mytab);

    }

    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.rare;
    }

    @SideOnly(Side.CLIENT)
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {

        if (world.isRemote) {
            Spell.get(1).cast(world,player,0, 1.0F, 1.0F, 1.0F, 1.0F);
        }
        return itemStack;
    }


}
