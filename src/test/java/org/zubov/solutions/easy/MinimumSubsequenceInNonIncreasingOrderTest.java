package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class MinimumSubsequenceInNonIncreasingOrderTest {

    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 10, 9, 8}, List.of(10, 9)),
                Arguments.of(new int[]{4,4,7,6,7}, List.of(7, 7, 6))
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] given, List<Integer> expected) {

        //Then
        List<Integer> result = MinimumSubsequenceInNonIncreasingOrder.minSubsequence(given);

        //When
        assertThat(result, equalTo(expected));
    }
}