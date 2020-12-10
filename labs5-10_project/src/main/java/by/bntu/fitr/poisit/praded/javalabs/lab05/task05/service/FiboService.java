package by.bntu.fitr.poisit.praded.javalabs.lab05.task05.service;

/**
 * @author Kiryl Praded
 * 10.12.2020
 */
public class FiboService {
    public static long findFibo(int number) {
        long firstNum = 1;
        long secondNum = 1;
        long resultNum = 1;
        for (int i = 3; i <= number; i++) {
            resultNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = resultNum;
        }
        return resultNum;
    }
}
