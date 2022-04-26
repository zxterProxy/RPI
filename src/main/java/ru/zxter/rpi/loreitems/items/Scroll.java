package ru.zxter.rpi.loreitems.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import electroblob.wizardry.spell.Spell;
import net.minecraft.entity.player.EntityPlayer;
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


public class Scroll extends Item {
    public Scroll(String name, String texture) {
        GameRegistry.registerItem(this, name);
        setUnlocalizedName(name);
        setTextureName(main.MODID + ":" + texture);
        setCreativeTab(TabReg.mytab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {

            Spell.get("meteor").cast(world, player, 0, 1.0F, 300.0F, 1.0F, 10.0F);
        }
        return stack;
    }
}