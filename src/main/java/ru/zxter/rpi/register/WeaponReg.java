package ru.zxter.rpi.register;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import ru.zxter.rpi.loreitems.weapons.*;

public class WeaponReg {
    public static Item rustytwohandedsword, brokenstraightsword, ruineddagger, bluntedrapier, therustyaxe, brokenshestoper, mizerickord, flamberg, keule, spikekeule;
    public static final Item.ToolMaterial rust = EnumHelper.addToolMaterial("RUST", 2, 513, 7.0F, 3.0F, 100);

    public static void WeaponReg() {

        rustytwohandedsword = new RustyTwoHandedSword(rust, "rustytwohandedsword", "test");
        brokenstraightsword = new BrokenStraightSword(rust, "brokenstraightsword", "brokenstraightsword");
        ruineddagger = new RuinedDagger(rust, "ruineddagger", "ruineddagger");
        bluntedrapier = new BluntedRapier(rust, "bluntedrapier", "bluntedrapier");
        therustyaxe = new TheRustyAxe(rust, "therustyaxe", "therustyaxe");
        brokenshestoper = new BrokenShestoper(rust, "brokenshestoper", "brokenshestoper");
        mizerickord = new Mizerickord(rust,"mizerickord","mizerickord");
        flamberg = new Flamberg (rust, "flamberg", "flamberg");
        keule = new Keule(rust, "keule", "keule_0");
        spikekeule = new SpikeKeule(rust, "spikekeule", "keule_1");
    }
}
