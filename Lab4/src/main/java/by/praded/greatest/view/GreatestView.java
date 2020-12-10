package by.praded.greatest.view;

import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class GreatestView {
    public static int[] enterNums(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of nums : ");
        int amount = scanner.nextInt();
        int[] nums = new int[amount];
        for(int i = 0; i < amount; i++) {
            System.out.println("Enter num : ");
            nums[i] = scanner.nextInt();
        }
        return nums;
    }

    public static void printMaxAndMin(int min, int max) {
        System.out.println("Min element of the array = " + min
                         + "\nMax element of the array = " + max);
    }
}
