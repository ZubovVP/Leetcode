package org.zubov.solutions.easy;

import java.util.*;

public class AddToArrayFormOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        num[num.length - 1] = num[num.length - 1] + k;
        for (int i = num.length - 1; i >= 0; i--) {
            if (i > 0) {
                num[i - 1] = num[i - 1] + recursion(num[i], result);
            }
            if (i == 0) {
                while (num[i] > 0) {
                    num[i] = recursion(num[i], result);
                }
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static int recursion(int num, List<Integer> list) {
        list.add(num % 10);
        return num / 10;
    }
}
