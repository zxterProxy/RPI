package ru.zxter.rpi.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import ru.zxter.rpi.main;
import ru.zxter.rpi.utility.Gif;


/**
 * Created by zxter on 26.04.2022.
 */

public class TestGui extends GuiScreen {

    Gif gif = new Gif(new ResourceLocation(main.MODID, "textures/test.gif"));

    @Override
    public void initGui() {
        buttonList.add(new GuiButton(0, 45, 122, 190, 20, "ПРОДОЛЖИТЬ"));
        buttonList.add(new GuiButton(1, 45, 144, 190, 20, "ОСТАНОВИТЬ"));
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        switch (button.id) {
            case 0:
                //Продолжить воспроизведение гифки
                gif.setConditionPlay();
                break;
            case 1:
                //Остановить воспроизведение гифки
                gif.setConditionStop();
                break;
        }
        super.actionPerformed(button);
    }

    @Override
    public void drawScreen(int x, int y, float tick) {

        //Воспроизведение гифки (входные параметры: xPos, yPos, width, height, scale (не знаю зачем он тут нужен но пускай будет))
        gif.gifPlay(0, 0, width, height, 1);

        super.drawScreen(x, y, tick);
    }

}

