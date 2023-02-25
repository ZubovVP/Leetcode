package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @ParameterizedTest
    @CsvSource(value = {
            "a, b, false",
            "aa, ab, false",
            "aa, aab, true",

    })
    void testCases(String ransomNote, String magazine, boolean expected) {
        //Given

        //When
        boolean result = RansomNote.canConstruct(ransomNote, magazine);

        //Then
        assertEquals(expected, result);
    }

}