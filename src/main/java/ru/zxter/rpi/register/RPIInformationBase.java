package ru.zxter.rpi.register;

import minefantasy.mf2.api.knowledge.InformationBase;
import minefantasy.mf2.api.knowledge.InformationPage;
import minefantasy.mf2.api.knowledge.ResearchArtefacts;
import minefantasy.mf2.api.rpg.SkillList;
import minefantasy.mf2.knowledge.KnowledgeListMF;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by zxter on 06.05.2021.
 */
public class RPIInformationBase {
    public static InformationBase scroll_info;
    public static void registerToolRecipes(){
        scroll_info = (new InformationBase("scroll_info", 10, -1, 1, new ItemStack(ItemReg.scroll), KnowledgeListMF.tungsten)).registerStat().setPage(KnowledgeListMF.engineering).addSkill(SkillList.engineering, 30).addSkill(SkillList.artisanry, 30);
        ResearchArtefacts.addArtefact(Items.diamond, scroll_info);
    }
}
