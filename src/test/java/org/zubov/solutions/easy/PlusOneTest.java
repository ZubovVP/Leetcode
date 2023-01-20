package org.zubov.solutions.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 4}),
                Arguments.of(new int[]{9}, new int[]{10}),
                Arguments.of(new int[]{4, 3, 2, 1}, new int[]{4, 3, 2, 2})
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, int[] expected) {

        //Then
        int[] result = PlusOne.plusOne(given);

        //When
        assertArrayEquals(expected, result);
    }
}