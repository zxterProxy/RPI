package ru.zxter.rpi.register;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.zxter.rpi.blocks.*;
import ru.zxter.rpi.render.titleentitys.BlockStatueTitleEntity;

public class BlockReg {

    public static Block cobblestoneclay;
    public static Block roof1;
    public static Block roof2;
    public static Block roof3;
    public static Block roofk;
    public static Block strengthening;
    public static Block monolith;
    public static Block fog;
    public static Block ac;
    public static Block statue;

    public static void BlockReg() {
        fog = new FogBlock("fog", "fog");
        cobblestoneclay = new CobblestoneClay("cobblestoneclay", "cobblestoneclay");
        monolith = new Monolith("monolith", "monolith");
        roofk = new Roof("roofk", "roofk", 3);
        roof1 = new Roof("roof1", "roof1", 16);
        roof2 = new Roof("roof2", "roof2", 16);
        roof3 = new Roof("roof3", "roof3", 16);
        strengthening = new Strengthening("strengthening", "strengthening", 4);
        ac = new Ac ("AC","1");
        statue = new Statue (Material.rock,"Statue");
        GameRegistry.registerBlock(statue, "Statue");
        GameRegistry.registerTileEntity(BlockStatueTitleEntity.class, "BlockStatueTitleEntity");

    }
}
