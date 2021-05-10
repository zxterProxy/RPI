package ru.zxter.rpi.utility;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

public class Gif {

    private InputStream inputStream;
    private List<DynamicTexture> list;
    private int frame = 0;
    private boolean condition = true;

    public Gif(ResourceLocation loc) {
        try {
            this.inputStream = Minecraft.getMinecraft().getResourceManager().getResource(loc).getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.list = this.images();
    }

    public void gifPlay(double xPos, double yPos, double width, double height, float scale) {
        if (this.getFrame() < this.list.size()) {
            this.drawImage(this.list.get(this.getFrame()), xPos, yPos, width, height, scale);
            if (this.condition == true)
                this.frame++;
        }
        if (this.getFrame() >= this.list.size()) {
            if (this.condition == true)
                this.frame = 0;
        }
    }

    private List<DynamicTexture> images() {
        try {
            ImageReader reader = ImageIO.getImageReadersByFormatName("gif").next();
            ImageInputStream stream = ImageIO.createImageInputStream(this.inputStream);
            List<DynamicTexture> list1 = new LinkedList<DynamicTexture>();

            reader.setInput(stream);

            int count = reader.getNumImages(true);
            for (int index = 0; index < count; index++) {
                BufferedImage frame = reader.read(index);
                list1.add(new DynamicTexture(frame));
            }
            return list1;
        } catch (IOException e) {
            return null;
        }
    }

    private void drawImage(DynamicTexture texture, double posX, double posY, double endX, double endY, double scale) {
        Tessellator tessellator = Tessellator.instance;
        GL11.glPushMatrix();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, texture.getGlTextureId());
        GL11.glScaled((double) scale, (double) scale, 1);
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV((double) (posX / scale), (double) ((posY / scale) + endY), 0.0, 0.0, 1.0);
        tessellator.addVertexWithUV((double) ((posX / scale) + endX), (double) ((posY / scale) + endY), 0.0, 1.0, 1.0);
        tessellator.addVertexWithUV((double) ((posX / scale) + endX), (double) (posY / scale), 0.0, 1.0, 0.0);
        tessellator.addVertexWithUV((double) (posX / scale), (double) (posY / scale), 0.0, 0.0, 0.0);
        tessellator.draw();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
        GL11.glPopMatrix();
    }

    public int getFrame() {
        return this.frame;
    }

    public boolean getBooleanCondition() {
        return this.condition;
    }

    public void setConditionStop() {
        this.condition = false;
    }

    public void setConditionPlay() {
        this.condition = true;
    }
}