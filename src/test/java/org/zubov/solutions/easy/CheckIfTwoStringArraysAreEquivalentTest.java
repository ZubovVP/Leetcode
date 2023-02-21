package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfTwoStringArraysAreEquivalentTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new String[]{"ab", "c"}, new String[]{"a", "bc"}, true),
                Arguments.of(new String[]{"a", "cb"}, new String[]{"ab", "c"}, false),
                Arguments.of(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}, true)
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(String[] w1, String[] w2, boolean expected) {
        //Then
        boolean result = CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(w1, w2);

        //When
        assertEquals(result, expected);
    }
}