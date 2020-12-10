package by.praded.dice.service;

import by.praded.dice.model.Dice;

import java.util.Random;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class DiceService {
    private static final Random random = new Random();

    public static int dropDice(Dice dice, int amountOfDrops) {
        int counter = 0;
        for(int i = 0; i < amountOfDrops; i++) {
            counter += dice.findElement(random.nextInt(6));
        }
        return counter;
    }
}
