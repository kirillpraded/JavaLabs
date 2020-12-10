package by.bntu.fitr.poisit.praded.javalabs.lab05.task04.controller;

import by.bntu.fitr.poisit.praded.javalabs.lab05.task04.service.NumberService;
import by.bntu.fitr.poisit.praded.javalabs.lab05.task04.view.FourthTaskView;

import java.util.InputMismatchException;

/**
 * @author Kiryl Praded
 * 10.12.2020
 * 1) Найти количество различных цифр у заданного натурального числа.
 * К примеру, число 12345436 имеет шесть различных цифр, а число 121212 – только
 * два.
 */
public class FourthTaskController {
    public static void main(String[] args) {
        FourthTaskView.welcomeMessage();
        try {

            int number = FourthTaskView.enterNumber();

            int amountOfDifferentDigits = NumberService.findAmountOfDifferentDigits(number);

            FourthTaskView.printResult(amountOfDifferentDigits, number);

        } catch (InputMismatchException ex) {
            FourthTaskView.printException(ex);
        }
    }
}
