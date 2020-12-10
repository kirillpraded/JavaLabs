package by.bntu.fitr.poisit.praded.javalabs.lab05.task02.view;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 10.12.2020
 */
public class SecondTaskView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void welcomeMessage() {
        System.out.println("Program defines if all" +
                " digits in the number are even or odd.");
    }

    public static int enterNumber() {
        System.out.println("Enter your number:");
        return SCANNER.nextInt();
    }

    public static void printResult(boolean result, int number) {
        if (result) {
            System.out.println("All digits in " + number + " are even/odd");
        } else {
            System.out.println("Number " + number + " contains even and odd digits.");
        }

    }

    public static void printException(InputMismatchException ex) {
        System.out.println("You should enter an integer.");
        System.out.println(ex.getMessage());
    }
}
