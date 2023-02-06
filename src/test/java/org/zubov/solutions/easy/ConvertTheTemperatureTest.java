package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTheTemperatureTest {
    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(36.50, new double[]{309.65000, 97.70000}),
                Arguments.of(122.11, new double[]{395.26000,251.79800})
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(double given, double[] expected) {
        //Then
        double[] result = ConvertTheTemperature.convertTemperature(given);

        //When
        assertArrayEquals(result, expected);
    }
}