package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 2, 3}, 2),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(null, 0),
                Arguments.of(new int[]{2, 2, 2, 3, 3, 3}, 2)
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, int expected) {

        //Then
        int result = MajorityElement.majorityElement(given);

        //When
        assertEquals(expected, result);
    }

}