package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 1}, 1)
                , Arguments.of(new int[]{4, 1, 2, 1, 2}, 4)
                , Arguments.of(new int[]{1}, 1));
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, int expected) {

        //Then
        int result = SingleNumber.singleNumber(given);

        //When
        assertEquals(expected, result);
    }
}