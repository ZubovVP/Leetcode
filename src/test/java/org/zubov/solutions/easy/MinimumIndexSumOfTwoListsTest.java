package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinimumIndexSumOfTwoListsTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"KFC", "Shogun", "Burger King"}, new String[]{"Shogun"}),
                Arguments.of(new String[]{"Shogun","Tapioca Express","Burger King","KFC"}, new String[]{"KFC","Shogun","Burger King"}, new String[]{"Shogun"}),
                Arguments.of(new String[]{"happy","sad","good"}, new String[]{"sad","happy","good"}, new String[]{"happy","sad"})
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(String[] word1, String[] word2, String[] expected) {

        //Then
        String[] result = MinimumIndexSumOfTwoLists.findRestaurant(word1, word2);

        //When
        assertArrayEquals(result, expected);
    }
}