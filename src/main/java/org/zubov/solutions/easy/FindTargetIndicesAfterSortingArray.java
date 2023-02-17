package org.zubov.solutions.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
                continue;
            }
            if (!result.isEmpty()) {
                return result;
            }
        }
        return result;
    }
}
