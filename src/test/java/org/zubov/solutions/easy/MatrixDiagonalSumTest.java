package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MatrixDiagonalSumTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 25),
                Arguments.of(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1}, {1,1,1,1}}, 8),
                Arguments.of(new int[][]{{5}}, 5)
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[][] given, int expected) {

        //Then
        int result = MatrixDiagonalSum.diagonalSum(given);

        //When
        assertEquals(expected, result);
    }
}