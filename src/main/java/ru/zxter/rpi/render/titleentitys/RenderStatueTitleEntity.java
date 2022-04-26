package ru.zxter.rpi.render.titleentitys;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import ru.zxter.rpi.main;
import ru.zxter.rpi.render.models.TestM;


public class RenderStatueTitleEntity  extends TileEntitySpecialRenderer {

    private static final ResourceLocation texture = new ResourceLocation(main.MODID+":" + "textures/test/test.png");

    private TestM model;



    public RenderStatueTitleEntity(){

        this.model = new TestM ();

    }



    @Override

    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float f)

    {

        GL11.glPushMatrix(); //rotations and translates
        GL11.glTranslatef((float)x +0.875F, (float)y-1F, (float)z +0.125F);
        GL11.glRotatef(180, 0.0F, 0.0F, 1.0F);

        this.bindTexture(texture);

        GL11.glPushMatrix(); //rendering model
        this.model.renderModel(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();

    }

}
