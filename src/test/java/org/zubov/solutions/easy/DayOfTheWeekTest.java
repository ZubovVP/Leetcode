package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekTest {

    @ParameterizedTest
    @CsvSource(value = {
            "31, 8, 2019, Saturday",
            "18, 7, 1999, Sunday",
            "15, 8, 1993, Sunday",

    })
    void testCases(int day, int month, int year, String expected) {
        //Given

        //When
        String result = DayOfTheWeek.dayOfTheWeek(day, month, year);

        //Then
        assertEquals(expected, result);
    }

}