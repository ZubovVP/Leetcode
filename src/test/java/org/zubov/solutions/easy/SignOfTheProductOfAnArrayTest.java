package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SignOfTheProductOfAnArrayTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{-1, -2, -3, -4, 3, 2, 1}, 1)
                , Arguments.of(new int[]{1, 5, 0, 2, -3}, 0)
                , Arguments.of(new int[]{-1, 1, -1, 1, -1}, -1)

        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, int expected) {

        //Then
        int result = SignOfTheProductOfAnArray.arraySign(given);

        //When
        assertEquals(expected, result);
    }
}