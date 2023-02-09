package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfWordsFoundInSentencesTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new String[]{"alice and bob love leetcode","i think so too","this is great thanks very much"}, 6),
                Arguments.of(new String[]{"please wait","continue to fight","continue to win"}, 3)
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(String[] given, int expected) {
        //Then
        int result = MaximumNumberOfWordsFoundInSentences.mostWordsFound(given);

        //When
        assertEquals(result, expected);
    }
}