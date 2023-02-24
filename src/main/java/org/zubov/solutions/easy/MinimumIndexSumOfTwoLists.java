package org.zubov.solutions.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumIndexSumOfTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        int sum = -1;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0, list2Length = list2.length; j < list2Length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (sum == -1 || sum > (i + j)) {
                        sum = i + j;
                        result.clear();
                        result.add(list1[i]);
                    } else if (sum == (i + j)) {
                        result.add(list1[i]);
                    }
                    break;
                }
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"KFC", "Shogun", "Burger King"})));
    }
}
