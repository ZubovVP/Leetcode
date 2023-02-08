package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FinalValueOfVariableAfterPerformingOperationsTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new String[]{"--X", "X++", "X++"}, 1),
                Arguments.of(new String[]{"++X", "++X", "X++"}, 3),
                Arguments.of(new String[]{"X++", "++X", "--X", "X--"}, 0)
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(String[] operations, int expected) {
        //Given

        //When
        int result = FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(operations);

        //Then
        assertEquals(expected, result);
    }
}