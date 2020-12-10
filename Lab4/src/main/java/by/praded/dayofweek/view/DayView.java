package by.praded.dayofweek.view;

import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class DayView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int enterDay(){
        System.out.println("Enter the number of the day : ");
        return SCANNER.nextInt();
    }

    public static void printDay(String day) {
        System.out.println("It's " + day + "!");
    }
}
