package ru.zxter.rpi.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import ru.zxter.rpi.main;

public class CobblestoneClay extends Block {
    public CobblestoneClay(String name, String texture) {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        this.setBlockTextureName(main.MODID + ":" + texture);
        this.setHardness(15F);
        this.setResistance(10F);
        this.setBlockName(name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 3);

    }
}
