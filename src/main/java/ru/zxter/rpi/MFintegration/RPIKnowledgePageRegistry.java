package ru.zxter.rpi.MFintegration;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import minefantasy.mf2.api.knowledge.client.EntryPageImage;
import minefantasy.mf2.api.knowledge.client.EntryPageRecipeBase;
import minefantasy.mf2.api.knowledge.client.EntryPageRecipeCarpenter;
import minefantasy.mf2.api.knowledge.client.EntryPageText;
import minefantasy.mf2.client.KnowledgePageRegistry;
import minefantasy.mf2.knowledge.KnowledgeListMF;
import ru.zxter.rpi.main;

/**
 * Регистрация наполения страниц в книге *
 */
@SideOnly(Side.CLIENT)
public class RPIKnowledgePageRegistry {
    public static void registerPages() {

        RPIKnowledgeList.test.addPages(new EntryPageText("knowledge.test"),
                new RPIEntryPageImage("textures/arts/1.png", 96, 96, "knowledge.test"));
    }
}
