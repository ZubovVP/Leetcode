package org.zubov.solutions.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder {
    public static List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();
        int value = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            result.add(nums[i]);
            value += nums[i];
            if (value > sum - value) {
                return result;
            }
        }
        return result;
    }
}
