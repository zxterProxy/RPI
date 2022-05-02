// Made with Blockbench 4.2.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer bb_main;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 18, -8.0F, -2.0F, -8.0F, 16, 2, 16, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 36, -6.0F, -14.0F, -6.0F, 12, 12, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -8.0F, -16.0F, -8.0F, 16, 2, 16, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 56, 10, -6.0F, -32.0F, -4.0F, 12, 16, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 48, 36, -6.0F, -48.0F, -4.0F, 12, 16, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 60, -4.0F, -52.0F, -4.0F, 8, 4, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 48, 0, -2.0F, -54.0F, -4.0F, 4, 2, 8, 0.0F, false));
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