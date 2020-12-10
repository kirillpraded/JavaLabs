package by.bntu.fitr.poisit.praded.javalabs.lab05.task05.view;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 10.12.2020
 */
public class FifthTaskView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void welcomeMessage() {
        System.out.println("Program finds the fibo number by its index.");
    }

    public static int enterNumber() {
        System.out.println("Enter index:");
        return SCANNER.nextInt();
    }

    public static void printResult(int index, long fibo) {
        System.out.println(index + " fibo number is " + fibo);

    }

    public static void printException(InputMismatchException ex) {
        System.out.println("You should enter an integer.");
        System.out.println(ex.getMessage());
    }
}
