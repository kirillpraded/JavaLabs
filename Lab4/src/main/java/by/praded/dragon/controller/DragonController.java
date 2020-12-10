package by.praded.dragon.controller;

import by.praded.dragon.model.Dragon;
import by.praded.dragon.view.DragonView;

import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class DragonController {
    public static void start() {
        Dragon dragon = new Dragon(DragonView.enterDragonName(), DragonView.enterDragonAge());
        DragonView.printDragonInfo(dragon);
    }
}
