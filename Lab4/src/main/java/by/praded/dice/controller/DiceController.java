package by.praded.dice.controller;

import by.praded.dice.model.Dice;
import by.praded.dice.service.DiceService;
import by.praded.dice.view.DiceView;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class DiceController {
    public static void start() {
        Dice dice = new Dice();
        DiceView.printResult(DiceService.dropDice(dice, DiceView.enterAmountOfDices()));

    }
}
