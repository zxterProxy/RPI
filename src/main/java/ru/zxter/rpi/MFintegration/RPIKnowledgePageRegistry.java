package ru.zxter.rpi.MFintegration;

import minefantasy.mf2.api.knowledge.client.EntryPageRecipeBase;
import minefantasy.mf2.api.knowledge.client.EntryPageText;
import minefantasy.mf2.client.KnowledgePageRegistry;

/**
 * Created by zxter on 06.05.2021.
 */
public class RPIKnowledgePageRegistry extends KnowledgePageRegistry {
    public static void registerPages() {

        RPIKnowledgeList.test.addPages(new EntryPageText("knowledge.test"),
                new EntryPageRecipeBase(RPIKnowledgeList.testR));
    }
}
