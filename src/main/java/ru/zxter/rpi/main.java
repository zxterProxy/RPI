package ru.zxter.rpi;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraftforge.common.MinecraftForge;
import ru.zxter.rpi.events.RPIEventHandler;
import ru.zxter.rpi.events.RPIGUIHandler;
import ru.zxter.rpi.proxy.CommonProxy;
import scala.xml.dtd.impl.Base;


@Mod(modid = main.MODID, name = main.MODNAME, version = main.VERSION, dependencies = "required-after:minefantasy2@")
public class main {

    public static final String MODID = "rpi";
    public static final String MODNAME = "Role-playing-items";
    public static final String VERSION = "0.1";

    @Mod.Instance(main.MODID)
    public static main instance;

    @SidedProxy(clientSide = "ru.zxter.rpi.proxy.ClientProxy", serverSide = "ru.zxter.rpi.proxy.CommonProxy")
    public static CommonProxy proxy;



    /**
     * ПРЕИНИЦАЛИЗАЦИЯ
     * <p>
     * ( Обычно тут регистрируют )
     * <p>
     * Регистрация блоков и предметов.
     * Регистрация Tile Entity
     * Регистрация сущностей
     * Присвоение имен в Ore Dictionary
     **/
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("\u001B[32m" + "[RPI PRE-INITIALIZATION]" + "\u001B[0m");
        proxy.preInit(event);
        proxy.registerRenderers();

    }

    /**
     * ИЦАЛИЗАЦИЯ
     * <p>
     * ( Обычно тут регистрируют )
     * <p>
     * Регистрация генераторов структур
     * Регистрация рецептов
     * Регистрация обработчиков действий
     **/
    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("\u001B[32m" + "[RPI INITIALIZATION]" + "\u001B[0m");
        proxy.init(event);
        instance = this;
    }

    /**
     * ПОСТИЦАЛИЗАЦИЯ
     * <p>
     * ( Обычно тут регистрируют )
     * <p>
     * Всё, что связанно с другимим модами
     **/
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("\u001B[32m" + "[RPI POST-INITIALIZATION]" + "\u001B[0m");
        proxy.postInit(event);
        //события
        RPIEventHandler events = new RPIEventHandler();
        MinecraftForge.EVENT_BUS.register(events);
        FMLCommonHandler.instance().bus().register(events);
        //gui
        NetworkRegistry.INSTANCE.registerGuiHandler(main.instance, new RPIGUIHandler());
    }

}
//ПОЯСНЕНИЯ ПО ПРОКСИ *

/**
 * Minecraft состоит из нескольких частей:
 * <p>
 * Физический клиент — это программа, которую вы запускаете с помощью лаунчера.
 * Физический сервер, который часто называется выделенным сервером — программа, которая запускается с помощью файлов типа minecraft_server.jar.
 * Логический клиент отвечает за отображение моделей и текстур, за прием данных от мышки и клавиатуры, за отображение GUI.
 * Логический сервер отвечает за всю игровую логику: спавн мобов, погоду, обновление инвентарей, AI и все другие механики игры.
 */