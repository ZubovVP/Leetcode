package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleStringTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}, "leetcode"),
                Arguments.of("abc", new int[]{0, 1, 2}, "abc")

        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(String s, int[] given, String expected) {

        //Then
        String result = ShuffleString.restoreString(s, given);

        //When
        assertEquals(expected, result);
    }
}