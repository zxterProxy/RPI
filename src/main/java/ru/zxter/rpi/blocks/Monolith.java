package ru.zxter.rpi.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import ru.zxter.rpi.main;

/**
 * Created by zxter on 03.01.2021.
 */
public class Monolith extends Block {
    public Monolith(String name, String texture) {
        super(Material.rock);

        GameRegistry.registerBlock(this, name);
        this.setBlockTextureName(main.MODID + ":" + texture);
        this.setHardness(6000000.0F);
        this.setResistance(6000000.0F);
        setBlockUnbreakable();
        this.setBlockName(name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 3);

    }
}
