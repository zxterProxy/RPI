package ru.zxter.rpi.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import ru.zxter.rpi.main;
import ru.zxter.rpi.render.titleentitys.BlockStatueTitleEntity;

/**
 * Created by zxter on 26.04.2022.
 */
public class Statue extends BlockContainer {

    public Statue(Material material, String name)
    {
        super(material);
        setHardness(4.0F);
        setStepSound(Block.soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabBlock);
        setBlockUnbreakable();
        setResistance(600000F);
        setBlockName(name);

    }




    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(main.MODID+":"+"test");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 4;
    }


    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        try
        {
            return new BlockStatueTitleEntity();
        }
        catch (Exception var3)
        {
            throw new RuntimeException(var3);
        }
    }
}
