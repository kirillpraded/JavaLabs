package by.bntu.fitr.poisit.praded.javalabs.lab05.task05.controller;


import by.bntu.fitr.poisit.praded.javalabs.lab05.task05.service.FiboService;
import by.bntu.fitr.poisit.praded.javalabs.lab05.task05.view.FifthTaskView;

import java.util.InputMismatchException;

/**
 * @author Kiryl Praded
 * 10.12.2020
 * 1) Найти конкретное число Фибоначчи заданного его порядковым номером.
 */
public class FifthTaskController {
    public static void main(String[] args) {
        FifthTaskView.welcomeMessage();
        try {

            int number = FifthTaskView.enterNumber();

            long fibo = FiboService.findFibo(number);

            FifthTaskView.printResult(number, fibo);

        } catch (InputMismatchException ex) {
            FifthTaskView.printException(ex);
        }
    }
}
