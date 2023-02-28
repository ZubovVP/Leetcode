package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    @ParameterizedTest
    @CsvSource(value = {
            "2, 1",
            "3, 2",
            "4, 3",
    })
    void testCases(int n, int expected) {
        //Given

        //When
        int result = FibonacciNumber.fib(n);

        //Then
        assertEquals(expected, result);
    }

}