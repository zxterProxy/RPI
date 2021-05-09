package ru.zxter.rpi.loreitems.relics;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TalkingSphere extends Item {
    public TalkingSphere(String name, String texture) {
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(CommonProxy.mytab);

    }

    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.rare;
    }

    @SideOnly(Side.CLIENT)
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {

        if (world.isRemote) {

            List<String> list = new ArrayList<String>();
            list.add(StatCollector.translateToLocal("message.rpi.message_0"));
            list.add(StatCollector.translateToLocal("message.rpi.message_1"));
            list.add(StatCollector.translateToLocal("message.rpi.message_2"));
            list.add(StatCollector.translateToLocal("message.rpi.message_3"));
            Random random = new Random();
            int size = list.size();
            int randomm = random.nextInt(size);
            String vivod = list.get(randomm);
            player.addChatMessage(new ChatComponentText(vivod));


        }
        return itemStack;
    }


}
