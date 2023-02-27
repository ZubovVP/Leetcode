package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{-4,-1,0,3,10}, new int[]{0,1,9,16,100}),
                Arguments.of(new int[]{-7,-3,2,3,11}, new int[]{4,9,9,49,121})
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] nums, int[] expected) {

        //Then
        int[] result = SquaresOfASortedArray.sortedSquares(nums);

        //When
        assertArrayEquals(result, expected);
    }
}