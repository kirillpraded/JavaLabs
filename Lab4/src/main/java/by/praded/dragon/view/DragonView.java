package by.praded.dragon.view;

import by.praded.dragon.model.Dragon;

import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class DragonView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String enterDragonName() {
        System.out.println("Enter the name of the dragon");
        return SCANNER.nextLine();
    }

    public static int enterDragonAge() {
        System.out.println("Enter age of the dragon");
        return SCANNER.nextInt();
    }

    public static void printDragonInfo(Dragon dragon) {
        System.out.println(dragon);
    }
}
