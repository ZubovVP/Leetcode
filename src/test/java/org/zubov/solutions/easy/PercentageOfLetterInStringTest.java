package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PercentageOfLetterInStringTest {

    @ParameterizedTest
    @CsvSource(value = {
            "foobar, o, 33",
            "jjjj, k, 0"
    })
    void testCases(String word, char letter, int expected) {
        //Given

        //When
        int result = PercentageOfLetterInString.percentageLetter(word, letter);

        //Then
        assertEquals(expected, result);
    }

}