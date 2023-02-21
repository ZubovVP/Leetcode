package org.zubov.solutions.easy;

import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s = Arrays.stream(word1).reduce((s1, s2) -> s1 + s2).orElse("");
        for (String s2 : word2) {
            if (s.startsWith(s2)) {
                s = s.substring(s2.length());
            } else {
                return false;
            }
        }
        return s.length() == 0;
    }
}
