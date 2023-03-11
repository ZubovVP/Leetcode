package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ReformatDateTest {

    @ParameterizedTest
    @CsvSource(value = {
            "20th Oct 2052, 2052-10-20",
            "6th Jun 1933, 1933-06-06",
            "26th May 1960, 1960-05-26"
    })
    void testCases(String date, String expected) {
        //Given

        //When
        String result = ReformatDate.reformatDate(date);

        //Then
        assertEquals(expected, result);
    }

}