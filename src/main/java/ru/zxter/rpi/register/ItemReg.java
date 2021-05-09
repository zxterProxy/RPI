package ru.zxter.rpi.register;

import net.minecraft.item.Item;
import ru.zxter.rpi.loreitems.relics.TalkingSphere;
import ru.zxter.rpi.loreitems.items.*;

public class ItemReg {
    public static Item talkingsphere;
    public static Item scroll;
    public static Item letter;
    public static Item sealedenvelope;
    public static Item diary;


    public static void ItemReg() {

        talkingsphere = new TalkingSphere("talkingsphere", "talkingsphere");
        scroll = new Scroll("scroll", "scroll");
        letter = new Letter("letter","letter");
        sealedenvelope = new Sealedenvelope("sealedenvelope","sealedenvelope");
        diary = new Diaty("diary","diary");

    }


}
