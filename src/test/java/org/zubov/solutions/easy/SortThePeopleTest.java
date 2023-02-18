package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortThePeopleTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170}, new String[]{"Mary", "Emma", "John"}),
                Arguments.of(new String[]{"Alice","Bob","Bob"}, new int[]{155,185,150}, new String[]{"Bob","Alice","Bob"})
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(String[] name, int[] heights, String[] expected) {

        //Then
        String[] result = SortThePeople.sortPeople(name, heights);

        //When
        assertArrayEquals(expected, result);
    }
}