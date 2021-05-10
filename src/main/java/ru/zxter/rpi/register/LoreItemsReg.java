package ru.zxter.rpi.register;

import net.minecraft.item.Item;
import ru.zxter.rpi.loreitems.equipment.*;
import ru.zxter.rpi.loreitems.rings.RingPrincessOfTheSun;

public class LoreItemsReg {

    //Rings
    //public static Item ringwithredstone;
    //public static Item ringwithgreenstone;
    //public static Item cristalring;
    //public static Item diseasering;

    //Equipment
    public static Item oldmedallionofthemercenary;
    public static Item brokenwizardswand;
    public static Item thebellofthecleric;
    public static Item distortedholyscripture;
    public static Item ifritsskull;
    public static Item theflameofthepyromancer;
    public static Item ringprincessofthesun;

    public static void LoreItemsReg() {

        //ringwithgreenstone = new RingWithGreenStone("ringwithgreenstone", "ringwithgreenstone");
        //ringwithredstone = new RingWithRedStone("ringwithredstone", "ringwithredstone");
        //cristalring = new CrystalRing("cristalring", "cristalring");
        //diseasering = new DiseaseRing("diseasering", "diseasering");
        oldmedallionofthemercenary = new OldMedallionOfTheMercenary("oldmedallionofthemercenary", "oldmedallionofthemercenary");
        brokenwizardswand = new BrokenWizardsWand("brokenwizardswand", "brokenwizardswand");
        theflameofthepyromancer = new TheflameOfThePyromancer("theflameofthepyromancer", "theflameofthepyromancer");
        thebellofthecleric = new TheBellOfTheCleric("thebellofthecleric", "thebellofthecleric");
        distortedholyscripture = new DistortedHolyScripture("distortedholyscripture", "distortedholyscripture");
        ifritsskull = new IfritsSkull("ifritsskull", "ifritsskull");
        ringprincessofthesun = new RingPrincessOfTheSun("ringprincessofthesun", "ringprincessofthesun");
    }
}
