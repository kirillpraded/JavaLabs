package by.bntu.fitr.poisit.praded.javalabs.lab05.task01.service;

/**
 * @author Kiryl Praded
 * 10.12.2020
 */
public class NumberService {
    public static int countDigits(int number) {
        int amount = (number == 0) ? 1 : 0;
        while (number != 0) {
            number /= 10;
            amount++;
        }
        return amount;
    }
}
