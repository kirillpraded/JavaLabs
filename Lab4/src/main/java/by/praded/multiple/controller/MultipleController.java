package by.praded.multiple.controller;

import by.praded.multiple.service.MultipleService;
import by.praded.multiple.view.MultipleView;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class MultipleController {
    public static void start() {
        boolean start = true;
        while (start){
            String command = MultipleView.enterCommand();
            switch (command) {
                case "1":
                    int toCheck = MultipleView.enterNum("Enter the num to check");
                    int divider = MultipleView.enterNum("Enter the divider");
                    MultipleView.printResult(toCheck, divider, MultipleService.isMultiple(toCheck, divider));
                    break;
                default:
                    start = false;
            }
        }
    }
}
