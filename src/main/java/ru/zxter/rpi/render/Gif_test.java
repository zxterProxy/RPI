package ru.zxter.rpi.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import ru.zxter.rpi.main;
import ru.zxter.rpi.utility.Gif;

/**
 * Created by zxter on 06.02.2021.
 */
public class Gif_test extends GuiScreen {
    private Gif gif = new Gif(new ResourceLocation(main.MODID, "textures/test.gif"));

    @SideOnly(Side.CLIENT)
    @Override
    public void drawScreen(int x, int y, float tick) {
        if (org.lwjgl.input.Keyboard.isKeyDown(org.lwjgl.input.Keyboard.KEY_J))
        //Воспроизведение гифки (входные параметры: xPos, yPos, width, height, scale (не знаю зачем он тут нужен но пускай будет))
        gif.gifPlay(0, 0, width, height, 1);
        super.drawScreen(x, y, tick);
    }

}

