package ru.zxter.rpi.register;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import minefantasy.mf2.api.knowledge.client.*;
import minefantasy.mf2.knowledge.KnowledgeListMF;

/**
 * Created by zxter on 06.05.2021.
 */

@SideOnly(Side.CLIENT)
public class RPIKnowledgePageRegistry {
    public static void registerPages() {

        RPIInformationBase.scroll_info.addPages(new EntryPageText("knowledge.mmm.1"),
                new EntryPageImage("rpi:textures/arts/1.png", 128, 128, ""));

    }
}
