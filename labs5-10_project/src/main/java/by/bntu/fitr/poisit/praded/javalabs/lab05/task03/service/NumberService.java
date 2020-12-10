package by.bntu.fitr.poisit.praded.javalabs.lab05.task03.service;


/**
 * @author Kiryl Praded
 * 10.12.2020
 */
public class NumberService {
    public static boolean isSequence(int number) {
        String num = number + "";

        if (num.length() < 2) {
            return false;
        }

        int increasing = 0;
        int descending = 0;

        for (int i = 0; i < num.length() - 1; i++) {
            int i1 = Integer.parseInt(String.valueOf(num.charAt(i)));
            int i2 = Integer.parseInt(String.valueOf(num.charAt(i + 1)));
            if (i1 > i2) {
                increasing++;
            } else if (i1 < i2) {
                descending++;
            }
        }

        if (increasing == 0 && descending == 0) {
            return false;
        }

        if (increasing == 0 || descending == 0) {
            return true;
        }

        return false;
    }
}
