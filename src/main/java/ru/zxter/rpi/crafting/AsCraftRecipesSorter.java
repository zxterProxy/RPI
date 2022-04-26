package ru.zxter.rpi.crafting;

import net.minecraft.item.crafting.IRecipe;

import java.util.Comparator;

/**
 * Created by zxter on 26.04.2022.
 */
public class AsCraftRecipesSorter implements Comparator {

    final  AsCraftManager asCraft;

    public AsCraftRecipesSorter (AsCraftManager asCraftManager) {

        this.asCraft = asCraftManager;
    }

    public int compareResipes(IRecipe irecipe1, IRecipe irecipe2){
        return irecipe1 instanceof AcShapelessRecipes  && irecipe2 instanceof  AcShapedRecipes ? 1: (irecipe2 instanceof AcShapelessRecipes && irecipe1 instanceof AcShapedRecipes ? -1 :(irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
    }
    //AcShapedRecipes
    //AcShapelessRecipes
    @Override
    public int compare(Object o1, Object o2) {
        return this.compareResipes((IRecipe)o1, (IRecipe)o2);
    }
}

