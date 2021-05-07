package ru.zxter.rpi.Recipe;

import cpw.mods.fml.common.registry.GameRegistry;
import minefantasy.mf2.item.list.ToolListMF;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ru.zxter.rpi.MFintegration.RPIKnowledgeList;
import ru.zxter.rpi.register.ItemReg;

import static net.minecraft.block.material.Material.rock;

/**
 * Created by zxter on 07.05.2021.
 */
public class RPIRecipe {
    public static void Recipe (){
        RPIKnowledgeList.testR = GameRegistry.addShapedRecipe(new ItemStack(ItemReg.scroll),
                new Object[]{"R ", " R", 'R', rock});
    }
}
