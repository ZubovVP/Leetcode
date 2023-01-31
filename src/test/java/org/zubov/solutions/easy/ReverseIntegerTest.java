package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(-123, -321)
                , Arguments.of(123, 321)
                , Arguments.of(0, 0)

        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int given, int expected) {

        //Then
        int reverse = ReverseInteger.reverse(given);

        //When
        assertEquals(expected, reverse);
    }


}