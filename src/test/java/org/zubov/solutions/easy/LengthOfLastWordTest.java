package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @ParameterizedTest
    @CsvSource(value = {
            "Hello World, 5",
            "   fly me   to   the moon  , 4",
            "luffy is still joyboy, 6"
    })
    void testCases(String line, int expected) {
        //Given

        //When
        int result = LengthOfLastWord.lengthOfLastWord(line);

        //Then
        assertEquals(expected, result);
    }
}