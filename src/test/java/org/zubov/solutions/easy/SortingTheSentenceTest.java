package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SortingTheSentenceTest {

    @CsvSource(value = {
            "is2 sentence4 This1 a3, This is a sentence",
            "Myself2 Me1 I4 and3, Me Myself and I"
    })
    @ParameterizedTest
    void testCases(String s, String expected) {

        //Then
        String result = SortingTheSentence.sortSentence(s);

        //When
        assertEquals(expected, result);
    }

}