package ru.zxter.rpi.register;

import net.minecraft.item.Item;
import ru.zxter.rpi.loreitems.items.*;
import ru.zxter.rpi.loreitems.relics.ItemTest;
import ru.zxter.rpi.loreitems.relics.TalkingSphere;

public class ItemReg {
    public static Item talkingsphere,scroll,letter,sealedenvelope,diary,wooden_mug,wooden_glass,good_bowl,itemtest;


    public static void ItemReg() {

        talkingsphere = new TalkingSphere("talkingsphere", "talkingsphere");
        scroll = new Scroll("scroll", "scroll");
        letter = new Letter("letter", "letter");
        sealedenvelope = new Sealedenvelope("sealedenvelope", "sealedenvelope");
        diary = new Diaty("diary", "diary");
        wooden_mug = new WoodenMug("wooden_mug","wooden_mug");
        wooden_glass = new WoodenMug("wooden_glass","wooden_glass");
        good_bowl = new GoodBowl("good_bowl","good_bowl");
        itemtest = new ItemTest("itemtest","itemtest");
    }


}
