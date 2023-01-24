package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest {

    @ParameterizedTest
    @CsvSource(value = {
            "leetcode, true"
            , "leetCode, false"
            , "USA, true"
            , "FlaG, false"
            , "Fla, true"})
    void testCases(String word, boolean expected) {
        //Given

        //When
        boolean result = DetectCapital.detectCapitalUse(word);

        //Then
        assertEquals(expected, result);
    }

}