package by.praded.controller;


import by.praded.dayofweek.controller.DayController;
import by.praded.dice.controller.DiceController;
import by.praded.dragon.controller.DragonController;
import by.praded.greatest.controller.GreatestController;
import by.praded.multiple.controller.MultipleController;
import by.praded.view.MainView;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class MainController {
    public static void main(String[] args) {
        boolean isTrue = true;
        while (isTrue){
            String choice = MainView.menu();
            switch (choice) {
                case "1":
                    DayController.start();
                    break;
                case "2":
                    DiceController.start();
                    break;
                case "3":
                    DragonController.start();
                    break;
                case "4":
                    GreatestController.start();
                    break;
                case "5":
                    MultipleController.start();
                    break;
                default:
                    isTrue = false;
            }
        }
    }
}
