package by.praded.dayofweek.controller;

import by.praded.dayofweek.exception.NoSuchDayException;
import by.praded.dayofweek.service.DayService;
import by.praded.dayofweek.view.DayView;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class DayController {

    public static void start() {
        try {
            DayView.printDay(DayService.getDayByIndex(DayService.registerDay(DayView.enterDay())));
        } catch (NoSuchDayException e) {
            e.printStackTrace();
        }
    }
}
