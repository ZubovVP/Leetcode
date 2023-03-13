package org.zubov.solutions.easy;

import java.util.HashMap;


public class MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                continue;
            } else {
                map.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {

            if (map.containsKey(nums2[i])) {
                return nums2[i];
            } else {
                continue;
            }
        }
        return -1;
    }
}
