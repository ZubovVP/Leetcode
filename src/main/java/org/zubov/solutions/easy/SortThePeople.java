package org.zubov.solutions.easy;

import java.util.*;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {

        Map<Integer, Integer> heightsMap = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            heightsMap.put(heights[i], i);
        }
        String[] result = new String[names.length];
        Arrays.sort(heights);
        for (int i = heights.length - 1, counter = 0; i >= 0; i--, counter++) {
            result[counter] = names[heightsMap.get(heights[i])];
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170});
        System.out.println(Arrays.toString(strings));
    }
}
