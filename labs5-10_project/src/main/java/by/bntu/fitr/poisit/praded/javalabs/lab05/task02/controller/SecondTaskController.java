package by.bntu.fitr.poisit.praded.javalabs.lab05.task02.controller;


import by.bntu.fitr.poisit.praded.javalabs.lab05.task02.service.NumberService;
import by.bntu.fitr.poisit.praded.javalabs.lab05.task02.view.SecondTaskView;

import java.util.InputMismatchException;

/**
 * @author Kiryl Praded
 * 10.12.2020
 * Разработайте программу, которая проверяет, что все цифры, которые входят в
 * заданное натурального число, имеют одинаковую чётность, т.е. либо все чётные, либо все нечётные.
 */
public class SecondTaskController {
    public static void main(String[] args) {

        SecondTaskView.welcomeMessage();
        try {

            int number = SecondTaskView.enterNumber();

            boolean result = NumberService.isAllDigitsEvenOrOdd(number);

            SecondTaskView.printResult(result, number);

        } catch (InputMismatchException ex) {
            SecondTaskView.printException(ex);
        }

    }
}
