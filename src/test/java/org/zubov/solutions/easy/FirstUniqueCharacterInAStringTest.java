package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {

    @ParameterizedTest
    @CsvSource(value = {"leetcode, 0", "loveleetcode, 2", "aabb, -1"})
    void testCases(String word, int expected) {
        int result = FirstUniqueCharacterInAString.firstUniqChar(word);
        assertEquals(expected, result);
    }
}