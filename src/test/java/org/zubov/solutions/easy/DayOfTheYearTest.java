package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheYearTest {

    @ParameterizedTest
    @CsvSource(value = {
            "2019-01-09, 9",
            "2019-02-10, 41"
    })
    void testCases(String date, int expected) {
        //Given

        //When
        int result = DayOfTheYear.dayOfYear(date);

        //Then
        assertEquals(expected, result);
    }

}