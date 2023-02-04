package org.zubov.solutions.easy;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        String[] elems = s.split("");
        Map<String, Long> entries = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(el -> el, Collectors.counting()));
        for (String el : elems) {
            if (entries.get(el) == 1) {
                return s.indexOf(el);
            }
        }
        return -1;
    }
}
