package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{1,3,5,6}, 5, 2),
                Arguments.of(new int[]{1,3,5,6}, 2, 1),
                Arguments.of(new int[]{1,3,5,6}, 7, 4)


        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, int target,  int expected) {

        //Then
        int result = SearchInsertPosition.searchInsert(given, target);

        //When
        assertEquals(expected, result);
    }
}