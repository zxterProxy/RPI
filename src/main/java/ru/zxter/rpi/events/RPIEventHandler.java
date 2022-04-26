package ru.zxter.rpi.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.potion.Potion;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.living.LivingEvent;
import ru.zxter.rpi.gui.TestGui;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.ItemReg;

public class RPIEventHandler {


    @SubscribeEvent
    public void onPlayerUpdateTicks(LivingEvent event) {
        if (event.entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.entity;

            if (player.isUsingItem() && player.getHeldItem() != null && player.getHeldItem().getItem() == ItemReg.scroll) {

                player.addChatMessage(new ChatComponentText("scroll used"));
            }

            if (org.lwjgl.input.Keyboard.isKeyDown(org.lwjgl.input.Keyboard.KEY_J)) {

                player.addChatMessage(new ChatComponentText("хуй"));

                {
                    TestGui.drawRect(1, 1, 1, 1, 1);
                }

            }
        }
    }
}