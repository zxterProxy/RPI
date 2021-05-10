package ru.zxter.rpi.mfintegration;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import minefantasy.mf2.api.knowledge.client.EntryPageBlastFurnace;
import minefantasy.mf2.api.knowledge.client.EntryPageText;
import minefantasy.mf2.item.list.ComponentListMF;
import ru.zxter.rpi.register.IngredientsReg;


/**
 * Регистрация наполения страниц в "книге исследований"
 */

/**
 * //ТЕКСТ//               RPIKnowledgeList.talkingsphere.addPages(new EntryPageText("rpi.knowledge.talkingsphere"));
 * //БАЗОВЫЙ РЕЦЕПТЦ//     RPIKnowledgeList.talkingsphere.addPages(new EntryPageRecipeBase(RPIKnowledgeList.talkingsphereR));
 * //ПЛОТНИЦКИЙ РЕЦЕПТ//   RPIKnowledgeList.talkingsphere.addPages(new EntryPageRecipeCarpenter(RPIKnowledgeList.talkingsphereCR));
 * //РЕЦЕПТ НАКОВАЛЬНИ//   RPIKnowledgeList.talkingsphere.addPages(new EntryPageRecipeAnvil(RPIKnowledgeList.talkingsphereAR));
 * //ПЛАВКА//              RPIKnowledgeList.talkingsphere.addPages(new EntryPageSmelting(new ItemStack(ItemReg.talkingsphere),
 */

@SideOnly(Side.CLIENT)
public class RPIKnowledgePageRegistry {
    public static void registerPages() {

        //Очиста таум-металла
        RPIKnowledgeList.smeltThaumium.addPages(new EntryPageText("rpi.knowledge.smeltThaumium.1"));
        RPIKnowledgeList.smeltThaumium.addPages(new EntryPageBlastFurnace(IngredientsReg.thaumium, ComponentListMF.bar.createComm("Thaumium")));
    }
}

