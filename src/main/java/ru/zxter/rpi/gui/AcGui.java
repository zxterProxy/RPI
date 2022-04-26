package ru.zxter.rpi.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import ru.zxter.rpi.main;

/**
 * Created by zxter on 25.04.2022.
 */
public class AcGui extends GuiContainer {

    private ResourceLocation texture = new ResourceLocation (main.MODID + ":" + "textures/gui/1.png");

    public AcGui(InventoryPlayer invPlayer, World world, int x, int y, int z){
        super(new ContainerAcGui(invPlayer,world, x,y,z));
        this.xSize = 176;
        this.ySize = 166;
    }

    public void onGuiClosed(){

        super.onGuiClosed();
    }

    protected void drawGuiContainerForegroundLayer(int i, int j){
this.fontRendererObj.drawString("sd",100,200,0x0000);

    }
    @Override
    protected void drawGuiContainerBackgroundLayer(float var1,int var2, int var3){
        GL11.glColor4f(1F,1F,1F,1F);
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        drawTexturedModalRect(guiLeft,guiTop, 0,0,xSize,ySize);
    }
}
