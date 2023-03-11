package org.zubov.solutions.easy;

import java.util.Arrays;
import java.util.Map;

public class ReformatDate {
    private static Map<String, String> MONTHS = Map.ofEntries(
            Map.entry("Jan", "01"),
            Map.entry("Feb", "02"),
            Map.entry("Mar", "03"),
            Map.entry("Apr", "04"),
            Map.entry("May", "05"),
            Map.entry("Jun", "06"),
            Map.entry("Jul", "07"),
            Map.entry("Aug", "08"),
            Map.entry("Sep", "09"),
            Map.entry("Oct", "10"),
            Map.entry("Nov", "11"),
            Map.entry("Dec", "12"));

    public static String reformatDate(String date) {
        String[] strings = date.split(" ");
        return String.format("%s-%s-%s", strings[2], extractMonth(strings[1]), extractDate(strings[0]));
    }

    private static String extractDate(String date) {
        return date.length() == 3 ? "0" + date.charAt(0) : date.substring(0, 2);
    }

    private static String extractMonth(String month) {
        return MONTHS.get(month);
    }
}
