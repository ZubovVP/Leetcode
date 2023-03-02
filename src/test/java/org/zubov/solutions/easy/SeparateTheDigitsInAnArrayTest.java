package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SeparateTheDigitsInAnArrayTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{13,25,83,77}, new int[]{1,3,2,5,8,3,7,7}),
                Arguments.of(new int[]{7,1,3,9}, new int[]{7,1,3,9})
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, int[] expected) {

        //Then
        int[] result = SeparateTheDigitsInAnArray.separateDigits(given);

        //When
        assertArrayEquals(expected, result);
    }
}