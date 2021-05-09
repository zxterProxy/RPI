package ru.zxter.rpi.mfintegration;

import cpw.mods.fml.common.registry.GameRegistry;
import minefantasy.mf2.api.crafting.anvil.IAnvilRecipe;
import minefantasy.mf2.api.crafting.carpenter.ICarpenterRecipe;
import minefantasy.mf2.api.knowledge.InformationBase;
import minefantasy.mf2.api.knowledge.InformationPage;
import minefantasy.mf2.api.refine.Alloy;
import minefantasy.mf2.api.refine.AlloyRecipes;
import minefantasy.mf2.api.refine.BlastFurnaceRecipes;
import minefantasy.mf2.api.rpg.SkillList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import ru.zxter.rpi.register.ItemReg;

import static net.minecraft.block.material.Material.rock;

/**
 * Тут идет регистрация влкадок в "книге исследований"
 */
public class RPIKnowledgeList{
    //public static IAnvilRecipe (РЕЦЕПТЫ НАКОВАЛЬНИ)
    //public static ICarpenterRecipe (РЕЦЕПТЫ СТОЛА ПЛОТНИКА)
    //public static IRecipe (ОБЫЧНЫЕ РЕЦЕПТЫ)
    //public static Alloy[] (РЕЦЕПТЫ ТИГЕЛЯ)

    public static IRecipe talkingsphereR;
    public static ICarpenterRecipe talkingsphereCR;
    public static IAnvilRecipe talkingsphereAR;
    public static BlastFurnaceRecipes talkingsphereMMM;
   // public static
    public static InformationBase talkingsphere;
    public static InformationPage relics = RPIInformationList.relics;
    public static void RPIKnowledgeListReg() {
        talkingsphere = (new InformationBase("test", 0, 0, 0, ItemReg.talkingsphere, (InformationBase) null))
                .registerStat().setPage(relics).addSkill(SkillList.artisanry, 35);

    }
}
