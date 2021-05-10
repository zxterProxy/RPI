package ru.zxter.rpi.mfintegration;

import minefantasy.mf2.api.knowledge.InformationBase;
import minefantasy.mf2.api.knowledge.ResearchArtefacts;
import minefantasy.mf2.item.ItemArtefact;
import minefantasy.mf2.item.list.ComponentListMF;
import ru.zxter.rpi.register.IngredientsReg;

/**
 * Created by zxter on 10.05.2021.
 */
public class RPIArtefactList {
    public static void init() {
        ((ItemArtefact) ComponentListMF.artefacts).registerAll();
        addArtisanry();
        //       addConstruction();
        //       addProvisioning();
        //       addEngineering();
    }

    private static void addArtisanry() {
        add(RPIKnowledgeList.smeltThaumium, IngredientsReg.thaumium);
    }


    private static void add(InformationBase info, Object... artifacts) {
        for (Object artifact : artifacts) {
            ResearchArtefacts.addArtefact(artifact, info);
        }
    }
}