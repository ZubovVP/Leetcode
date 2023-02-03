package org.zubov.solutions.easy;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int index;
        for (index = 0; index < nums.length; index++) {
            if (target <= nums[index]) return index;
        }
        return index;
    }
}
