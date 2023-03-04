package org.zubov.solutions.easy;

import java.time.LocalDate;

public class DayOfTheWeek {
    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        String dayOfWeek = localDate.getDayOfWeek().name();
        return dayOfWeek.charAt(0) + dayOfWeek.substring(1).toLowerCase();
    }
}
