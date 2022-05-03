import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class custom_model extends ModelBase {
	private final ModelRenderer bb_main;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.0F, -2.0F, -5.0F, 20, 2, 10, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 12, -8.0F, -16.0F, -1.0F, 16, 12, 4, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 28, -8.0F, -20.0F, -3.0F, 16, 4, 6, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 38, -8.0F, -4.0F, -3.0F, 16, 2, 6, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 44, 40, -8.0F, -16.0F, -3.0F, 2, 12, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 46, 6.0F, -16.0F, -3.0F, 2, 12, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 38, 32, -7.0F, -22.0F, -3.0F, 14, 2, 6, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 12, -5.0F, -23.0F, -3.0F, 10, 1, 6, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}