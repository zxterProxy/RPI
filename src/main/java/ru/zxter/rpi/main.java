package ru.zxter.rpi;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import ru.zxter.rpi.events.RPIEventHandler;
import ru.zxter.rpi.proxy.CommonProxy;


@Mod(modid = main.MODID, name = main.MODNAME, version = main.VERSION, dependencies = "required-after:minefantasy2@")
public class main {

    public static final String MODID = "rpi";
    public static final String MODNAME = "Role-playing-items";
    public static final String VERSION = "0.1";
    @SidedProxy(clientSide = "ru.zxter.rpi.proxy.ClientProxy", serverSide = "ru.zxter.rpi.proxy.CommonProxy")
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        proxy.registerRenderers();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);

    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        //события
        MinecraftForge.EVENT_BUS.register(new RPIEventHandler());

    }

}
