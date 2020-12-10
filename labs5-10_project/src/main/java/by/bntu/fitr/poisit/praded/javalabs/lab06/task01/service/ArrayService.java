package by.bntu.fitr.poisit.praded.javalabs.lab06.task01.service;

/**
 * @author Kiryl Praded
 * 10.12.2020
 */
public class ArrayService {
    public static int findSumOfNegative(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i < 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int multiplyBetweenMaxAndMin(int[] array) {
        int indexOfMin = findIndexOfMin(array);
        int indexOfMax = findIndexOfMax(array);

        int multiplication = 1;

        if (indexOfMax > indexOfMin) {
            for (int i = indexOfMin; i < indexOfMax; i++) {
                multiplication *= array[i];
            }
        } else {
            for (int i = indexOfMax; i < indexOfMin; i++) {
                multiplication *= array[i];
            }
        }
        return multiplication;
    }

    private static int findIndexOfMin(int[] array) {
        int index = 0;
        int value = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < value) {
                value = array[i];
                index = i;
            }
        }
        return index;
    }

    private static int findIndexOfMax(int[] array) {
        int index = 0;
        int value = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                value = array[i];
                index = i;
            }
        }
        return index;
    }
}
