package ru.zxter.rpi.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.client.MinecraftForgeClient;
import ru.zxter.rpi.mfintegration.RPIKnowledgePageRegistry;
import ru.zxter.rpi.mobs.Savage;
import ru.zxter.rpi.register.GuiReg;
import ru.zxter.rpi.register.WeaponReg;
import ru.zxter.rpi.render.FlambergRender;
import ru.zxter.rpi.render.KeuleRender;
import ru.zxter.rpi.render.RenderSavage;
import ru.zxter.rpi.render.titleentitys.BlockStatueTitleEntity;
import ru.zxter.rpi.render.titleentitys.RenderStatueTitleEntity;

/**
 * ClientProxy
 * <p>
 * Действия выполняються на стороне только клиента
 * <p>
 * Регистрация моделей блоков/мобов/предметов
 * Регистрация рендеров этих самых моделей
 * ИТД...
 */
public class ClientProxy extends CommonProxy {

    //Регистрация новых рендеров блоков.

    public void registerNewBlockRenders(){
        ClientRegistry.bindTileEntitySpecialRenderer(BlockStatueTitleEntity.class, new RenderStatueTitleEntity());
    }

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
    public void registerRenderers() {
        GuiReg.GuiReg();

        RenderingRegistry.registerEntityRenderingHandler(Savage.class, new RenderSavage(new ModelBiped(), 0.5F));
        MinecraftForgeClient.registerItemRenderer(WeaponReg.flamberg, new FlambergRender(3));
        MinecraftForgeClient.registerItemRenderer(WeaponReg.keule, new KeuleRender(2));
        MinecraftForgeClient.registerItemRenderer(WeaponReg.spikekeule, new KeuleRender(2));
    }
}
