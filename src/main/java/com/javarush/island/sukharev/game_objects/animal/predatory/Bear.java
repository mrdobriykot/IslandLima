package com.javarush.island.sukharev.game_objects.animal.predatory;

import com.javarush.island.sukharev.game_objects.animal.abstracts.Predatory;

import java.math.BigDecimal;

public class Bear extends Predatory {

    public Bear(String icon, BigDecimal weight, int speedCell, BigDecimal maximumSatiety, int[] whoToEatAndHowToEat, int id) {
        super(icon, weight, speedCell, id, maximumSatiety, whoToEatAndHowToEat);
    }
}
