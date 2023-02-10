package org.zubov.solutions.easy;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortNums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < sortNums.length; j++) {
                if(nums[i] == sortNums[j]){
                    nums[i] = j;
                    break;
                }
            }
        }
        return nums;
    }
}
