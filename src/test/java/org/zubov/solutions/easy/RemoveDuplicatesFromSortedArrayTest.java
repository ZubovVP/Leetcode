package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2, 0}, 2),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4, 0, 0, 0, 0, 0}, 5)
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, int[] expected, int k) {

        //Then
        int result = RemoveDuplicatesFromSortedArray.removeDuplicates(given);

        //When
        assertArrayEquals(expected, given);
        assertEquals(k, result);
    }
}