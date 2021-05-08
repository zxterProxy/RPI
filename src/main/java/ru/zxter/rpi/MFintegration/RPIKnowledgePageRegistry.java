package ru.zxter.rpi.mfintegration;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import minefantasy.mf2.api.knowledge.client.EntryPageCraft;
import minefantasy.mf2.api.knowledge.client.EntryPageRecipeAnvil;
import minefantasy.mf2.api.knowledge.client.EntryPageRecipeBase;
import minefantasy.mf2.api.knowledge.client.EntryPageText;
import minefantasy.mf2.knowledge.KnowledgeListMF;
import net.minecraft.item.crafting.IRecipe;

/**
 * Регистрация наполения страниц в книге *
 */
@SideOnly(Side.CLIENT)
public class RPIKnowledgePageRegistry {
    public static void registerPages() {

        RPIKnowledgeList.test.addPages(new EntryPageText("knowledge.test"),
                new RPIEntryPageImage("textures/arts/1.png", 96, 96, "knowledge.test"));
        RPIKnowledgeList.test.addPages(new EntryPageRecipeAnvil(KnowledgeListMF.fluxR));
    }
}
