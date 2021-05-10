package ru.zxter.rpi.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import ru.zxter.rpi.main;

import java.util.List;

public class Strengthening extends Block {

    private int count;
    @SideOnly(Side.CLIENT)
    private IIcon[] icon;

    public Strengthening(String name, String texture, int count) {
        super(Material.rock);
        GameRegistry.registerBlock(this, ItemBlockMetadata.class, name);
        this.setBlockTextureName(main.MODID + ":strengthening/" + texture);
        this.setHardness(13F);
        this.count = count;
        this.setResistance(10F);
        this.setBlockName(name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 0);


    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List subItems) {
        for (int n = 0; n < this.count; ++n) {
            subItems.add(new ItemStack(this, 1, n));
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return this.icon[meta];

    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon) {
        this.icon = new IIcon[this.count];
        for (int i = 0; i < this.count; i++) {
            this.icon[i] = icon.registerIcon(this.getTextureName() + "_" + i);
        }

    }
}

