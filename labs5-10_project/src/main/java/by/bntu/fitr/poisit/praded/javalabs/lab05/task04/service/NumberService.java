package by.bntu.fitr.poisit.praded.javalabs.lab05.task04.service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kiryl Praded
 * 10.12.2020
 */
public class NumberService {
    public static int findAmountOfDifferentDigits(int number) {
        Set<Character> uniqueDigits = new HashSet<Character>();
        String num = number + "";

        for (int i = 0; i < num.length(); i++) {
            uniqueDigits.add(num.charAt(i));
        }

        return uniqueDigits.size();
    }
}
