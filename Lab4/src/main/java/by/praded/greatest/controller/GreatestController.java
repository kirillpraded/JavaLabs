package by.praded.greatest.controller;

import by.praded.greatest.service.GreatestService;
import by.praded.greatest.view.GreatestView;

import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class GreatestController {
    public static void start() {
        int[] nums = GreatestView.enterNums();
        GreatestView.printMaxAndMin(GreatestService.findMin(nums), GreatestService.findMax(nums));
    }

}
