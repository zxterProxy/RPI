package ru.zxter.rpi.render;

import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

/**
 * Created by zxter on 31.01.2021.
 */
public class BigItemRenderer implements IItemRenderer {
    private final float scale;

    public BigItemRenderer(float scale) {
        this.scale = scale;
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type){
            case EQUIPPED_FIRST_PERSON:
                renderEquippedItem(item, (EntityLivingBase) data[1], true);
                break;
            case EQUIPPED:
                renderEquippedItem(item, (EntityLivingBase) data[1], false);
                break;
            default:
        }
    }

    private void renderEquippedItem(ItemStack stack, EntityLivingBase entity, boolean firstPerson) {
        GL11.glPushMatrix();
        float f = scale;
        if (firstPerson) {
            f *= 1.75F;                                              //отображение от 1 лица
            GL11.glRotatef(30,1,0,0);
        } else {
            f *= (entity instanceof EntityPlayer ? 1.0F : 1.0F);               //отображение от 3 лица
            //x=высота
            //y=назад вперед
            //z=влево в право
            GL11.glTranslatef(-0.8F , -0F , 0.1F ); //первая цифра - высота положения предмета

        }
        GL11.glScalef(f, f, f);
        IIcon icon = stack.getItem().getIcon(stack, 0);
        Tessellator tessellator = Tessellator.instance;
        ItemRenderer.renderItemIn2D(tessellator, icon.getMaxU(), icon.getMinV(), icon.getMinU(), icon.getMaxV(), icon.getIconWidth(), icon.getIconHeight(), 2.1F);
//последняя цифра - толщина предмета в руке (от 1 лица)
        GL11.glPopMatrix();
    }
}
