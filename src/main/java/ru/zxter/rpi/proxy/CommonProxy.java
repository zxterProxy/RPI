package ru.zxter.rpi.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.zxter.rpi.mfintegration.RPIArtefactList;
import ru.zxter.rpi.mfintegration.RPIInformationList;
import ru.zxter.rpi.mfintegration.RPIKnowledgeList;
import ru.zxter.rpi.mobs.Savage;
import ru.zxter.rpi.recipe.RPIRecipe;
import ru.zxter.rpi.register.*;


/**
 * CommonProxy
 * <p>
 * Действия данного класса выполняються на стороне и клиента и сервера
 */
public class CommonProxy {


    public void registerNewBlockRenders() {
    }

    public void preInit(FMLPreInitializationEvent event) {
        //Armor
        ArmorReg.ArmorReg();
        //Items
        ItemReg.ItemReg();
        //LoreItems
        LoreItemsReg.LoreItemsReg();
        //Blocks
        BlockReg.BlockReg();
        //Weapon
        WeaponReg.WeaponReg();
        //Equipment
        EquipmentReg.EquipmentReg();
        //Tools
        ToolsReg.ToolsReg();
        //Ingredients
        IngredientsReg.IngredientsReg();
        //Food
        FoodReg.FoodReg();
        //Drinks
        DrinksReg.DrinksReg();
        //Mobs
        MobReg.MobReg(Savage.class, "savage", 0x00FFFF, 0x00008B);

    }

    public void init(FMLInitializationEvent event) {
        //SpawnMobs
        MobSpawnReg.MobSpawnReg();
        //Tabs
        TabReg.init();

    }

    public void postInit(FMLPostInitializationEvent event) {


        //RPIKnowledgeList
        RPIKnowledgeList.RPIKnowledgeListReg();
        //RPIInformationList
        RPIInformationList.init();
        //MF+RPI Крафты
        RPIRecipe.init();
        //Статисика брони
        //ArmorReg.ArmorStatsReg();
        //Предметы для изучения
        RPIArtefactList.init();
    }

    public void registerRenderers() {
        // Здесь ничего, так как сервер не рендерит графику или существ!
    }
}