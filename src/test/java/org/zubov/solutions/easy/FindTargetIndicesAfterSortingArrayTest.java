package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindTargetIndicesAfterSortingArrayTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{1,2,5,2,3}, 2, List.of(1, 2)),
                Arguments.of(new int[]{1,2,5,2,3}, 3, List.of(3)),
                Arguments.of(new int[]{1,2,5,2,3}, 5, List.of(4))

        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] numbers, int target, List<Integer> expected) {
        //Given

        //When
        List<Integer> result = FindTargetIndicesAfterSortingArray.targetIndices(numbers, target);

        //Then
        assertEquals(expected, result);
    }
}