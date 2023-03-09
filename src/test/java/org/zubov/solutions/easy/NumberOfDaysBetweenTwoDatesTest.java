package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDaysBetweenTwoDatesTest {

    @ParameterizedTest
    @CsvSource(value = {
            "2019-06-29, 2019-06-30, 1",
            "2020-01-15, 2019-12-31, 15"
    })
    void testCases(String date1, String date2, int expected) {
        int result = NumberOfDaysBetweenTwoDates.daysBetweenDates(date1, date2);
        assertEquals(expected, result);
    }

}