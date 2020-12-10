package by.bntu.fitr.poisit.praded.javalabs.lab05.task03.view;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 10.12.2020
 */
public class ThirdTaskView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void welcomeMessage() {
        System.out.println("Program defines if entered number is descending/increasing sequence.");
    }

    public static int enterNumber() {
        System.out.println("Enter number digits:");
        return SCANNER.nextInt();
    }

    public static void printResult(boolean isSeq, int number) {
        if (isSeq) {
            System.out.println(number + " is sequence");
        } else {
            System.out.println(number + " is not a sequence");

        }
    }

    public static void printException(InputMismatchException ex) {
        System.out.println("You should enter an integer.");
        System.out.println(ex.getMessage());
    }
}
