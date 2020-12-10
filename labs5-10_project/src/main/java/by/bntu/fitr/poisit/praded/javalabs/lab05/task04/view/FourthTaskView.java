package by.bntu.fitr.poisit.praded.javalabs.lab05.task04.view;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 10.12.2020
 */
public class FourthTaskView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void welcomeMessage() {
        System.out.println("Program counts number of unique digits in a number");
    }

    public static int enterNumber() {
        System.out.println("Enter number to count digits:");
        return SCANNER.nextInt();
    }

    public static void printResult(int amountOfDigits, int number) {
        System.out.println("There are " + amountOfDigits + " unique digits in " + number + ".");

    }

    public static void printException(InputMismatchException ex) {
        System.out.println("You should enter an integer.");
        System.out.println(ex.getMessage());
    }
}
