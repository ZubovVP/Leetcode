package org.zubov.solutions.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numbers.merge(nums[i], 1, (oldValue, nuwValue) -> oldValue + 1);
        }
        return numbers.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }
}
