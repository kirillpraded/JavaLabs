package by.praded.dice.view;

import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class DiceView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int enterAmountOfDices() {
        System.out.println("Enter amount of dices to drop : ");
        return SCANNER.nextInt();
    }

    public static void printResult(int result) {
        System.out.println("Sum of dropped numbers = " + result);
    }
}
