package ru.zxter.rpi.register;

import net.minecraft.block.Block;
import ru.zxter.rpi.blocks.*;

public class BlockReg {

    public static Block cobblestoneclay;
    public static Block roof1;
    public static Block roof2;
    public static Block roof3;
    public static Block roofk;
    public static Block strengthening;
    public static Block monolith;
    public static Block fog;

    public static void BlockReg() {
        fog = new FogBlock("fog", "fog");
        cobblestoneclay = new CobblestoneClay("cobblestoneclay", "cobblestoneclay");
        monolith = new Monolith("monolith", "monolith");
        roofk = new Roof("roofk", "roofk", 3);
        roof1 = new Roof("roof1", "roof1", 16);
        roof2 = new Roof("roof2", "roof2", 16);
        roof3 = new Roof("roof3", "roof3", 16);
        strengthening = new Strengthening("strengthening", "strengthening", 4);

    }
}
