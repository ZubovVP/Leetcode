package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {

    @ParameterizedTest
    @CsvSource(value = {
            "123, 0",
            "2244, 52",
            "0, 0"
    })
    void testCases(int number, int expected) {
        //Given

        //When
        int result = SubtractTheProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(number);

        //Then
        assertEquals(expected, result);
    }
}