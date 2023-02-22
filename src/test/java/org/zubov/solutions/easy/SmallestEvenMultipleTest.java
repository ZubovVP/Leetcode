package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SmallestEvenMultipleTest {

    @ParameterizedTest
    @CsvSource(value = {
            "5, 10",
            "6, 6"
    })
    void testCases(int n, int expected) {
        //Given

        //When
        int result = SmallestEvenMultiple.smallestEvenMultiple(n);

        //Then
        assertEquals(expected, result);
    }
}