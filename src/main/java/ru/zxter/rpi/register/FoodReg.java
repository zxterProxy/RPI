package ru.zxter.rpi.register;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import ru.zxter.rpi.loreitems.drinks.Wine;
import ru.zxter.rpi.loreitems.food.CrescentGrass;
import ru.zxter.rpi.loreitems.food.RPIFood;

public class FoodReg {
    public static

    Item crescentgrass,burger,black_bread,fresh_bread,delicious_salad,chowder,hearty_soup,bacon,
    fried_sausage,divine_steak,delicious_chicken,meat_pie,strange_fried_fish,great_cheese;

    public static void FoodReg() {

        crescentgrass = new CrescentGrass("crescentgrass", "moongrass", 10, 1F, true);
        burger = new RPIFood("burger","burger",5, 1F, true);
        black_bread = new RPIFood("black_bread","black_bread",5, 1F, false);
        fresh_bread = new RPIFood("fresh_bread","fresh_bread",5, 1F, false);
        delicious_salad = new RPIFood("delicious_salad","delicious_salad",5, 1F, false);
        chowder = new RPIFood("chowder","chowder",5, 1F, true);
        hearty_soup = new RPIFood("hearty_soup","hearty_soup",5, 1F, true);
        bacon = new RPIFood("bacon","bacon",5, 1F, true);
        fried_sausage = new RPIFood("fried_sausage","fried_sausage",5, 1F, true);
        divine_steak = new RPIFood("divine_steak","divine_steak",5, 1F, true);
        delicious_chicken = new RPIFood("delicious_chicken","delicious_chicken",5, 1F, true);
        meat_pie = new RPIFood("meat_pie","meat_pie",5, 1F, true);
        strange_fried_fish = new RPIFood("strange_fried_fish","strange_fried_fish",5, 1F, true);
        great_cheese = new RPIFood("great_cheese","great_cheese",5, 1F, true);

    }
}
