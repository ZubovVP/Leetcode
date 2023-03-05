package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfStringsThatAppearAsSubstringsInWordTest {

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                Arguments.of(new String[]{"a", "abc", "bc", "d"}, "abc", 3),
                Arguments.of(new String[]{"a", "b", "c"}, "aaaaabbbbb", 2),
                Arguments.of(new String[]{"a", "a", "a"}, "ab", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSource")
    void testCases(String[] patterns, String word, int count) {
        //Given

        //When
        int result = NumberOfStringsThatAppearAsSubstringsInWord.numOfStrings(patterns, word);

        //Then
        assertEquals(count, result);
    }

}