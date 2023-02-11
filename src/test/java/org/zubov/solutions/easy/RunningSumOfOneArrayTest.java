package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOfOneArrayTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, new int[]{1,3,6,10}),
                Arguments.of(new int[]{1,1,1,1,1}, new int[]{1,2,3,4,5}),
                Arguments.of(new int[]{3,1,2,10,1}, new int[]{3,4,6,16,17})
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, int[] expected) {
        //Then
        int[] result = RunningSumOfOneArray.runningSum(given);

        //When
        assertArrayEquals(result, expected);
    }
}