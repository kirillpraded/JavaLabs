package by.praded.multiple.view;

import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class MultipleView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String enterCommand() {
        System.out.println("1. Check is number divides by divider" + "\nAny symbol to exit.");
        SCANNER.nextLine();
        return SCANNER.nextLine();
    }

    public static void printResult(int toCheck, int check, boolean result) {
        System.out.println(toCheck + " % " + check + " = 0 : " + result);
    }

    public static int enterNum(String str){
        
        System.out.println(str);
        SCANNER.nextLine();
        return SCANNER.nextInt();
    }
}
