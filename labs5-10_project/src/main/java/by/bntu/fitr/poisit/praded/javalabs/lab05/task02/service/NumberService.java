package by.bntu.fitr.poisit.praded.javalabs.lab05.task02.service;

/**
 * @author Kiryl Praded
 * 10.12.2020
 */
public class NumberService {
    public static boolean isAllDigitsEvenOrOdd(int number) {

        boolean result = true;
        String num = number + "";
        boolean isEven = false;

        if (Integer.parseInt(String.valueOf(num.charAt(0))) % 2 == 0) {
            isEven = true;
        }

        for (int i = 0; i < num.length(); i++) {
            if ((Integer.parseInt(String.valueOf(num.charAt(i))) % 2 == 0) != isEven) {
                result = false;
            }
        }
        return result;
    }
}
