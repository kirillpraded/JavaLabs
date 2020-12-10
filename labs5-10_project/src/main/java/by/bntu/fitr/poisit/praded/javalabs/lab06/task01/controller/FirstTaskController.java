package by.bntu.fitr.poisit.praded.javalabs.lab06.task01.controller;

import by.bntu.fitr.poisit.praded.javalabs.lab06.task01.service.ArrayService;
import by.bntu.fitr.poisit.praded.javalabs.lab06.task01.view.FirstTaskView;

import java.util.InputMismatchException;

/**
 * @author Kiryl Praded
 * 10.12.2020
 * В векторе, состоящем из n вещественных элементов, вычислить:
 * сумму отрицательных элементов вектора и произведение элементов вектора,
 * расположенных между максимальным и минимальным элементами.
 */
public class FirstTaskController {
    public static void main(String[] args) {

        FirstTaskView.welcomeMessage();
        try {

            int[] array = FirstTaskView.enterArray();

            int sumOfNegative = ArrayService.findSumOfNegative(array);

            FirstTaskView.printResult(sumOfNegative, "Sum of negative is ");

            int multiplication = ArrayService.multiplyBetweenMaxAndMin(array);

            FirstTaskView.printResult(multiplication, "Multiplication of nums between max and min elements is ");


        } catch (InputMismatchException ex) {
            FirstTaskView.printException(ex);
        }
    }
}
