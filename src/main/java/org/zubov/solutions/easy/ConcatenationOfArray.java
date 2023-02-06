package org.zubov.solutions.easy;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int[] result = Arrays.copyOf(nums, nums.length * 2);
        System.arraycopy(nums, 0, result, nums.length, nums.length);
        return result;
    }
}
