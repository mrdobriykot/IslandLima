package com.javarush.island.sukharev.game_objects.animal.herbivores;

import com.javarush.island.sukharev.game_objects.animal.abstracts.Herbiovores;

import java.math.BigDecimal;

public class Duck extends Herbiovores {

    public Duck(String icon, BigDecimal weight, int speedCell, BigDecimal maximumSatiety, int[] whoToEatAndHowToEat, int id) {
        super(icon, weight, speedCell, id, maximumSatiety, whoToEatAndHowToEat);
    }
}
