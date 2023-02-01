package org.zubov.solutions.easy;

import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int[] uniqInts = Arrays.stream(nums).distinct().toArray();
        for (int i = 0; i < nums.length; i++) {
            if (uniqInts.length > i) {
                nums[i] = uniqInts[i];
            } else {
                nums[i] = 0;
            }
        }
        return uniqInts.length;
    }

    public static void main(String[] args) {
        int i = RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2});
    }

}
