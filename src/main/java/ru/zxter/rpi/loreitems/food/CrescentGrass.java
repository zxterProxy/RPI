package ru.zxter.rpi.loreitems.food;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;

public class CrescentGrass extends ItemFood {
    public CrescentGrass(String name, String texture, int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        GameRegistry.registerItem(this, name);
        this.setUnlocalizedName(name);
        this.setMaxStackSize(16);
        this.setTextureName(main.MODID + ":" + texture);
        this.setCreativeTab(CommonProxy.mytab);
        this.setHasSubtypes(true);
        this.setAlwaysEdible();


    }


    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 2400, 0));
            player.addPotionEffect(new PotionEffect(Potion.heal.id, 1000, 0));
        }

    }
}