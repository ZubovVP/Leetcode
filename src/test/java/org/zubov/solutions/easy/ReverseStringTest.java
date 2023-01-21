package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new char[]{'1', '2', '3'}, new char[]{'3', '2', '1'})
                , Arguments.of(new char[]{'1', '2'}, new char[]{'2', '1'})
                , Arguments.of(new char[]{' '}, new char[]{' '})

        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(char[] given, char[] expected) {

        //Then
       ReverseString.reverseString(given);

        //When
        assertArrayEquals(expected, given);
    }

}