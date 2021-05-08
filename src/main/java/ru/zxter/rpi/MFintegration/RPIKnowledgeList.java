package ru.zxter.rpi.mfintegration;

import minefantasy.mf2.api.knowledge.InformationBase;
import minefantasy.mf2.api.knowledge.InformationPage;
import minefantasy.mf2.api.rpg.SkillList;
import ru.zxter.rpi.register.ItemReg;

/**
 * Created by zxter on 06.05.2021.
 * Тут идет регистрация иконок изучений для "книги исследований"
 */
public class RPIKnowledgeList{

    public static InformationBase test;
    public static InformationPage relics = RPIInformationList.relics;
    public static void RPIKnowledgeListReg() {
        test = (new InformationBase("test", 0, 0, 0, ItemReg.scroll, (InformationBase) null))
                .registerStat().setPage(relics).addSkill(SkillList.artisanry, 35).setPerk();
    }
}
