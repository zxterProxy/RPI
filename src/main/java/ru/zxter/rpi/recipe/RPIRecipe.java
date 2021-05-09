package ru.zxter.rpi.recipe;

import cpw.mods.fml.common.registry.GameRegistry;
import minefantasy.mf2.api.MineFantasyAPI;
import minefantasy.mf2.api.crafting.refine.BloomRecipe;
import minefantasy.mf2.api.refine.Alloy;
import minefantasy.mf2.api.refine.AlloyRecipes;
import minefantasy.mf2.api.rpg.Skill;
import minefantasy.mf2.api.rpg.SkillList;
import minefantasy.mf2.item.list.ComponentListMF;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ru.zxter.rpi.mfintegration.RPIKnowledgeList;
import ru.zxter.rpi.register.ItemReg;

import java.util.ArrayList;
import java.util.List;

import static minefantasy.mf2.api.MineFantasyAPI.addBlastFurnaceRecipe;
import static net.minecraft.item.EnumAction.block;

/**
 * Регистрация рецептов RPI
 */

public class RPIRecipe {
    private static final Skill artisanry = SkillList.artisanry;
    private static final Skill engineering = SkillList.engineering;
    private static final Skill construction = SkillList.construction;

    public static void init() {

        //Обычный рецепт
     RPIKnowledgeList.talkingsphereR = GameRegistry.addShapedRecipe(new ItemStack(ItemReg.talkingsphere),
             new Object[]{"###", "XYX", "###", ('X'), Blocks.gravel, ('#'), Items.iron_ingot, ('Y'), Blocks.obsidian});

        //Рецепт обычной плавки
        GameRegistry.addSmelting(ItemReg.scroll, new ItemStack(ItemReg.talkingsphere), 1F);

        //Рецепт на верстаке плотника
     RPIKnowledgeList.talkingsphereCR = MineFantasyAPI.addCarpenterRecipe(null, new ItemStack(ItemReg.talkingsphere),
             "", "minecraft:dig.gravel", "hands", -1, 1, new Object[]{"DDDD","DDDD","DDDD","DDDD", ('D'), ItemReg.scroll,});

        //Рецепт на наковальне
     RPIKnowledgeList.talkingsphereAR = MineFantasyAPI.addAnvilRecipe(artisanry, new ItemStack(ItemReg.talkingsphere), "talkingsphere",
             true, 1, 1, 5, new Object[]{"CCC", 'C', ItemReg.scroll});

       //Рецепт очистки металла
     MineFantasyAPI.addBlastFurnaceRecipe(ItemReg.scroll, new ItemStack(ItemReg.scroll));

       //Рецепты для домницы
     BloomRecipe.addRecipe(ItemReg.scroll, new ItemStack(ItemReg.diary));

     // MineFantasyAPI.addAlloy(new ItemStack(ItemReg.diary),new Object[]{"C#",('C'),ItemReg.scroll,('#'), Items.iron_ingot,});
     // MineFantasyAPI.addRatioAlloy(4,new ItemStack(ItemReg.talkingsphere),new Object[]{"CC","CC", ('C'), ItemReg.scroll});
     //   AlloyRecipes.addAlloy(new ItemStack(ItemReg.talkingsphere),alloys);
}
}