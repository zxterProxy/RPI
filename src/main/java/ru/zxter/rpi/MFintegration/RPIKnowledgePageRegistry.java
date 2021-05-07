package ru.zxter.rpi.MFintegration;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import minefantasy.mf2.api.knowledge.client.EntryPageRecipeAnvil;
import minefantasy.mf2.api.knowledge.client.EntryPageRecipeBase;
import minefantasy.mf2.api.knowledge.client.EntryPageRecipeCarpenter;
import minefantasy.mf2.api.knowledge.client.EntryPageText;
import minefantasy.mf2.client.KnowledgePageRegistry;
import minefantasy.mf2.knowledge.KnowledgeListMF;

/**
 * Created by zxter on 06.05.2021.
 */
@SideOnly(Side.CLIENT)
public class RPIKnowledgePageRegistry{
    public static void registerPages() {

        RPIKnowledgeList.test.addPages(new EntryPageText("knowledge.test"),
                new EntryPageRecipeCarpenter(KnowledgeListMF.stoneAnvilRecipe),
                new EntryPageRecipeAnvil(KnowledgeListMF.nailR));
    }
}
