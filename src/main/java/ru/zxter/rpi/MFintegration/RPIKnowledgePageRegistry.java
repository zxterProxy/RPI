package ru.zxter.rpi.mfintegration;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import minefantasy.mf2.api.knowledge.client.*;
import net.minecraft.item.ItemStack;
import ru.zxter.rpi.register.ItemReg;

/**
 * Регистрация наполения страниц в "книге исследований"
 */
@SideOnly(Side.CLIENT)
public class RPIKnowledgePageRegistry {
    public static void registerPages() {
        RPIKnowledgeList.talkingsphere.addPages(new EntryPageText("rpi.knowledge.talkingsphere"));
        RPIKnowledgeList.talkingsphere.addPages(new EntryPageRecipeBase(RPIKnowledgeList.talkingsphereR));
        RPIKnowledgeList.talkingsphere.addPages(new EntryPageRecipeCarpenter(RPIKnowledgeList.talkingsphereCR));
        RPIKnowledgeList.talkingsphere.addPages(new EntryPageRecipeAnvil(RPIKnowledgeList.talkingsphereAR));
        RPIKnowledgeList.talkingsphere.addPages(new EntryPageSmelting(new ItemStack(ItemReg.talkingsphere),
                    new ItemStack(ItemReg.scroll)));
    }
}
