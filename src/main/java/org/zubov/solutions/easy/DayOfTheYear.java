package org.zubov.solutions.easy;

import java.time.LocalDate;

public class DayOfTheYear {
    public static int dayOfYear(String date) {
        String[] elems = date.split("-");
        LocalDate d = LocalDate.of(Integer.valueOf(elems[0]), Integer.valueOf(elems[1]), Integer.valueOf(elems[2]));
        return d.getDayOfYear();
    }
}
