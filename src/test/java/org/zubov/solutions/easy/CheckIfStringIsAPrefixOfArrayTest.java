package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfStringIsAPrefixOfArrayTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of("iloveleetcode", new String[]{"i", "love", "leetcode", "apples"}, true),
                Arguments.of("iloveleetcode", new String[]{"apples","i","love","leetcode"}, false)
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(String text, String[] words, boolean expected) {
        //Then
        boolean result = CheckIfStringIsAPrefixOfArray.isPrefixString(text, words);

        //When
        assertEquals(result, expected);
    }
}