package org.zubov.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCommonValueTest {

    public static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{2, 4}, 2),
                Arguments.of(new int[]{1, 2, 3, 6}, new int[]{2, 3, 4, 5}, 2)
        );
    }

    @MethodSource("provideArrays")
    @ParameterizedTest
    void testCases(int[] nums1, int[] nums2, int expected) {

        //Then
        int result = MinimumCommonValue.getCommon(nums1, nums2);

        //When
        assertEquals(expected, result);
    }

}