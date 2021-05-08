package ru.zxter.rpi.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.model.ModelBiped;
import ru.zxter.rpi.mfintegration.RPIKnowledgePageRegistry;
import ru.zxter.rpi.mobs.Savage;
import ru.zxter.rpi.render.RenderSavage;

public class ClientProxy extends CommonProxy {


    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }


    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
        RPIKnowledgePageRegistry.registerPages();
    }

    @Override
    public void registerRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(Savage.class, new RenderSavage(new ModelBiped(), 0.5F));
    }
}
