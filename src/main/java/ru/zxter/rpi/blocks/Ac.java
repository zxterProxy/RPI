package ru.zxter.rpi.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import ru.zxter.rpi.main;
import ru.zxter.rpi.register.GuiReg;

/**
 * Created by zxter on 25.04.2022.
 */

public class Ac extends Block{
    public Ac(String name, String texture) {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        this.setHardness(6000000.0F);
        this.setResistance(6000000.0F);
        setBlockUnbreakable();
        this.setBlockName(name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 3);
    }

    public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c)

    {
        if (!player.isSneaking()) {
            player.openGui(main.instance,GuiReg.guiIDAc, world, x, y, z);
            player.addChatMessage(new ChatComponentText("scroll used"));
            return true;
        }else{
            return false;
        }

    }
}
