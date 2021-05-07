package ru.zxter.rpi.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import ru.zxter.rpi.entitys.Fog;
import ru.zxter.rpi.main;


import java.util.Random;



/**
 * Created by zxter on 18.01.2021.
 */

public class FogBlock extends BlockContainer {

    public FogBlock(String name, String texture) {
        super(Material.web);

        GameRegistry.registerBlock(this, name);
        this.setBlockTextureName(main.MODID + ":" + texture);
        this.setHardness(6000000.0F);
        this.setResistance(6000000.0F);
        this.setLightOpacity(13);
        setBlockUnbreakable();
        this.setLightLevel(0.9375F);
        this.setBlockName(name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 3);

        GameRegistry.registerTileEntity(Fog.class, "tileBlockCauldron");
    }
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
        if (random.nextInt(100) == 0)
        {
            world.playSound((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, main.MODID +":" + "block.fog", 0.5F, random.nextFloat() * 0.4F + 0.8F, false);

        }


    }
    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new Fog();
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World w, int x, int y, int z) {
        return null;
    }

    public int getRenderBlockPass() {
        return 1;
    }

    public boolean isOpaqueCube() {
        return false;
    }


    @Override
    public void onBlockHarvested(World w, int p_149681_2_, int p_149681_3_, int p_149681_4_,
                                 int p_149681_5_, EntityPlayer p_149681_6_) {
        super.onBlockHarvested(w, p_149681_2_, p_149681_3_, p_149681_4_, p_149681_5_, p_149681_6_);
    }

    @Override
    public void onEntityCollidedWithBlock(World w, int x, int y, int z, Entity en) {
        if(w.getTileEntity(x,y,z) instanceof Fog){
            ((Fog)w.getTileEntity(x,y,z)).setState(1);
        }
        super.onEntityCollidedWithBlock(w, x, y, z, en);
        if (en instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) en;
            en.setInWeb();
            boolean a = player.getActivePotionEffect(Potion.blindness) != null;

            if (!a) {
                player.addPotionEffect((new PotionEffect(Potion.blindness.id, 300, 2)));
                player.addPotionEffect((new PotionEffect(Potion.confusion.id, 300, 0)));

            }
        }

    }

}


