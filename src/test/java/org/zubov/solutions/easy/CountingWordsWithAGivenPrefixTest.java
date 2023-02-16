package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountingWordsWithAGivenPrefixTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new String[]{"pay","attention","practice","attend"}, "at", 2),
                Arguments.of(new String[]{"leetcode","win","loops","success"}, "code", 0)
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(String[] given, String prefix, int expected) {
        //Then
        int result = CountingWordsWithAGivenPrefix.prefixCount(given, prefix);

        //When
        assertEquals(result, expected);
    }
}