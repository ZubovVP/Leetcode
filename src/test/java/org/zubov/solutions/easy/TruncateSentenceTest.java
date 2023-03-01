package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TruncateSentenceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "Hello how are you Contestant, 4, Hello how are you",
            "What is the solution to this problem, 4, What is the solution",
            "chopper is not a tanuki, 5, chopper is not a tanuki"
    })
    void testCases(String sentence, int k, String expected) {
        //When

        //Given
        String result = TruncateSentence.truncateSentence(sentence, k);

        //Then
        assertEquals(expected, result);
    }
}