package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayFromPermutationTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{0,2,1,5,3,4}, new int[]{0,1,2,4,5,3}),
                Arguments.of(new int[]{5,0,1,2,3,4}, new int[]{4,5,0,1,2,3})
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, int[] expected) {
        //Then
        int[] result = BuildArrayFromPermutation.buildArray(given);

        //When
        assertArrayEquals(result, expected);
    }
}