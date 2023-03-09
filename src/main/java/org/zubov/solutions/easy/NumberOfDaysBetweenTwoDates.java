package org.zubov.solutions.easy;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NumberOfDaysBetweenTwoDates {
    public static int daysBetweenDates(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateOne = LocalDate.parse(date1, formatter);
        LocalDate dateTwo = LocalDate.parse(date2, formatter);
        long days = Duration.between(dateOne.atStartOfDay(), dateTwo.atStartOfDay()).toDays();
        return (int) Math.abs(days);
    }
}
