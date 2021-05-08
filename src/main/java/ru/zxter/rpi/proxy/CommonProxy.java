package ru.zxter.rpi.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.MinecraftForgeClient;
import ru.zxter.rpi.ctabs.BossTab;
import ru.zxter.rpi.mfintegration.RPIInformationList;
import ru.zxter.rpi.mfintegration.RPIKnowledgeList;
import ru.zxter.rpi.ctabs.MyTab;
import ru.zxter.rpi.main;
import ru.zxter.rpi.mobs.Savage;
import ru.zxter.rpi.register.*;
import ru.zxter.rpi.render.FlambergRender;
import ru.zxter.rpi.render.KeuleRender;


public class CommonProxy {

    public static CreativeTabs mytab = new MyTab(main.MODID);
    public static CreativeTabs bosstab = new BossTab("Boss");

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
        //Mobs
        MobReg.MobReg(Savage.class,"savage", 0x00FFFF, 0x00008B);
        MinecraftForgeClient.registerItemRenderer(WeaponReg.flamberg, new FlambergRender(3));
        MinecraftForgeClient.registerItemRenderer(WeaponReg.keule, new KeuleRender(2));
        MinecraftForgeClient.registerItemRenderer(WeaponReg.spikekeule, new KeuleRender(2));


    }

    public void init(FMLInitializationEvent event) {
        //SpawnMobs
        MobSpawnReg.MobSpawnReg();
    }

    public void postInit(FMLPostInitializationEvent event) {
        //RPIInformationList
        RPIInformationList.init();
        //RPIKnowledgeList
        RPIKnowledgeList.RPIKnowledgeListReg();

    }

    public void registerRenderers()
    {
        // Здесь ничего, так как сервер не рендерит графику или существ!
    }
}