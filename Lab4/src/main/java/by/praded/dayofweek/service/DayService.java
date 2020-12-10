package by.praded.dayofweek.service;

import by.praded.dayofweek.exception.NoSuchDayException;
import by.praded.dayofweek.model.Day;

import java.time.DayOfWeek;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class DayService {
    public static Day registerDay(int number) throws NoSuchDayException {
        if (number < 1|| number>7){
            throw new NoSuchDayException("Number of the day is invalid");
        }
        return new Day(number);
    }
    public static String getDayByIndex(Day day){
        return DayOfWeek.of(day.getNumber()).name();
    }
}
