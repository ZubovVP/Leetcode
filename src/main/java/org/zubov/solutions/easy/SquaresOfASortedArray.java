package org.zubov.solutions.easy;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
