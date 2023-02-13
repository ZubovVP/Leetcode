package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CountOddNumbersInAnIntervalRangeTest {
    @ParameterizedTest
    @CsvSource(value = {
            "3, 7, 3",
            "8, 10, 1"
    })
    void testCases(int low, int hight, int expected) {
        //Given

        //When
        int result = CountOddNumbersInAnIntervalRange.countOdds(low, hight);

        //Then
        assertEquals(expected, result);
    }
}