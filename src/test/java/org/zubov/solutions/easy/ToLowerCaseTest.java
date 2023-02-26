package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ToLowerCaseTest {

    @ParameterizedTest
    @CsvSource(value = {
            "Hello, hello",
            "here, here",
            "LOVELY, lovely",
    })
    void testCases(String word, String expected) {
        //Given

        //When
        String result = ToLowerCase.toLowerCase(word);

        //Then
        assertEquals(expected, result);
    }
}