package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AverageValueOfEvenNumbersThatAreDivisibleByThreeTest {

    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 6, 10, 12, 15}, 9),
                Arguments.of(new int[]{1, 2, 4, 7, 10}, 0)
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, int expected) {

        //Then
        int result = AverageValueOfEvenNumbersThatAreDivisibleByThree.averageValue(given);

        //When
        assertEquals(expected, result);
    }

}