package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringTest {

    @ParameterizedTest
    @CsvSource(value = {
            "Let's take LeetCode contest, s'teL ekat edoCteeL tsetnoc",
            "God Ding, doG gniD"
    })
    void testCases(String s, String expected) {
        //Given

        //When
        String result = ReverseWordsInAString.reverseWords(s);

        //Then
        assertEquals(expected, result);
    }

}