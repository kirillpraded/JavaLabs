package by.bntu.fitr.poisit.praded.javalabs.lab06.task01.view;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 10.12.2020
 */
public class FirstTaskView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void welcomeMessage() {
        System.out.println("Program counts all negatives numbers and multiply all numbers " +
                "between max and min elements");
    }

    public static int[] enterArray() {
        System.out.println("Enter size of the array:");
        int size = SCANNER.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter num(" + (i + 1) + "/" + size + "): ");
            array[i] = SCANNER.nextInt();
        }
        return array;
    }


    public static void printResult(int value, String res) {
        System.out.println(res + value);

    }

    public static void printException(InputMismatchException ex) {
        System.out.println("You should enter an integer.");
        System.out.println(ex.getMessage());
    }
}
