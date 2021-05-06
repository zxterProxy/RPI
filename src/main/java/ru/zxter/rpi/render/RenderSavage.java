package ru.zxter.rpi.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import ru.zxter.rpi.main;

/**
 * Created by zxter on 28.01.2021.
 */
public class RenderSavage extends RenderBiped{

    private static final ResourceLocation textureLocation = new ResourceLocation(main.MODID + ":textures/entity/barbarian.png");

    public RenderSavage(ModelBiped model, float shadowSize)
    {
        super(model, shadowSize);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return textureLocation;
    }
}
