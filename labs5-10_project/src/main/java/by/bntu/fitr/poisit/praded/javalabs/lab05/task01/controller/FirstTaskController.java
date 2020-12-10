package by.bntu.fitr.poisit.praded.javalabs.lab05.task01.controller;

import by.bntu.fitr.poisit.praded.javalabs.lab05.task01.service.NumberService;
import by.bntu.fitr.poisit.praded.javalabs.lab05.task01.view.FirstTaskView;

import java.util.InputMismatchException;

/**
 * @author Kiryl Praded
 * 10.12.2020
 * Написать программу, которая подсчитывает количество цифр заданного натурального числа.
 */
public class FirstTaskController {

    public static void main(String[] args) {
        FirstTaskView.welcomeMessage();
        try {

            int number = FirstTaskView.enterNumber();

            int numberOfDigits = NumberService.countDigits(number);

            FirstTaskView.printResult(numberOfDigits, number);

        } catch (InputMismatchException ex) {
            FirstTaskView.printException(ex);
        }
    }
}
