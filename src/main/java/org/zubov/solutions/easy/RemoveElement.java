package org.zubov.solutions.easy;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int[] rightNums = Arrays.stream(nums).filter(num -> num != val).toArray();
        for (int i = 0; i < nums.length; i++) {
            if (rightNums.length > i) {
                nums[i] = rightNums[i];
            } else {
                nums[i] = 0;
            }
        }
        return rightNums.length;
    }
}
