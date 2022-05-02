package ru.zxter.rpi.render.titleentitys;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import ru.zxter.rpi.main;

import ru.zxter.rpi.render.models.custom_model;
import ru.zxter.rpi.render.models.testS;


public class RenderStatueTitleEntity  extends TileEntitySpecialRenderer {

    private static final ResourceLocation texture = new ResourceLocation(main.MODID+":" + "textures/test/testGG.png");

    private custom_model model;



    public RenderStatueTitleEntity(){

        this.model = new custom_model();

    }



    @Override

    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float f)

    {

        GL11.glPushMatrix(); //rotations and translates
        GL11.glTranslatef((float)x +0.5F, (float)y + 1.5F, (float)z +0.5F);
        GL11.glRotatef(180, 0.0F, 0.0F, 1F);
        this.bindTexture(texture);
        GL11.glPushMatrix(); //rendering model
        this.model.renderModel(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();


    }

}
