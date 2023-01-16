package org.zubov.solutions.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String[] wordMinLength = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).orElse("").split("");
        StringBuilder stringBuilder = new StringBuilder();
        List<String[]> listArrays = Arrays.stream(strs).map(word -> word.split("")).toList();
        for (int i = 0; i < wordMinLength.length; i++) {
            String s = wordMinLength[i];
            for (String[] value : listArrays) {
                if (!value[i].equals(s)) {
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
