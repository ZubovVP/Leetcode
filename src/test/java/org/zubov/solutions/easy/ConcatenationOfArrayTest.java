package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfArrayTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1}, new int[]{1, 2, 1, 1, 2, 1}),
                Arguments.of(new int[]{1, 3, 2, 1}, new int[]{1, 3, 2, 1, 1, 3, 2, 1})
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, int[] expected) {
        //Then
        int[] result = ConcatenationOfArray.getConcatenation(given);

        //When
        assertArrayEquals(result, expected);
    }
}