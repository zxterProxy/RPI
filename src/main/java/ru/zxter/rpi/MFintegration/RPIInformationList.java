package ru.zxter.rpi.MFintegration;

import minefantasy.mf2.api.knowledge.InformationList;
import minefantasy.mf2.api.knowledge.InformationPage;

/**
 * Created by zxter on 06.05.2021.
 * Тут регистрируются страницы "книги исследований"
 */
public class RPIInformationList{
    public static InformationPage relics = new InformationPage("infoPage.relics", null).registerInfoPage();
    public static void init() {
    }
}


