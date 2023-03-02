package org.zubov.solutions.easy;

import java.util.ArrayList;
import java.util.Collections;

public class SeparateTheDigitsInAnArray {
    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int x = nums[i];
            while (x > 0) {
                int rem = x % 10;
                integers.add(rem);
                x /= 10;

            }
        }
        Collections.reverse(integers);
        int ans[] = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            ans[i] = integers.get(i);
        }
        return ans;
    }
}
