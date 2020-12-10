package by.bntu.fitr.poisit.praded.javalabs.lab05.task03.controller;

import by.bntu.fitr.poisit.praded.javalabs.lab05.task03.service.NumberService;
import by.bntu.fitr.poisit.praded.javalabs.lab05.task03.view.ThirdTaskView;

import java.util.InputMismatchException;

/**
 * @author Kiryl Praded
 * 10.12.2020
 * Разработайте программу, которая проверяет,
 * что цифры заданного натурального числа образуют возрастающую (или убывающую) последовательность.
 */
public class ThirdTaskController {
    public static void main(String[] args) {
        ThirdTaskView.welcomeMessage();
        try {

            int number = ThirdTaskView.enterNumber();

            boolean isSeq = NumberService.isSequence(number);

            ThirdTaskView.printResult(isSeq, number);

        } catch (InputMismatchException ex) {
            ThirdTaskView.printException(ex);
        }
    }
}
