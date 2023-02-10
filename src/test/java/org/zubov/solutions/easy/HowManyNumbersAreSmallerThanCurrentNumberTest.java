package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HowManyNumbersAreSmallerThanCurrentNumberTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{8,1,2,2,3}, new int[]{4,0,1,1,3}),
                Arguments.of(new int[]{6,5,4,8}, new int[]{2,1,0,3}),
                Arguments.of(new int[]{7,7,7,7}, new int[]{0,0,0,0})
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, int[] expected) {
        //Then
        int[] result = HowManyNumbersAreSmallerThanCurrentNumber.smallerNumbersThanCurrent(given);

        //When
        assertArrayEquals(result, expected);
    }
}