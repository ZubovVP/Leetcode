package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FirstLetterToAppearTwiceTest {


    @CsvSource(value = {
            "abccbaacz, c",
            "abcdd, d"
    })
    @ParameterizedTest
    void testCases(String word, char expected) {
        //Given

        //When
        char result = FirstLetterToAppearTwice.repeatedCharacter(word);

        //Then
        assertEquals(expected, result);
    }
}