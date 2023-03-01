package org.zubov.solutions.easy;

import java.util.Arrays;

public class TruncateSentence {
    public static String truncateSentence(String s, int k) {
        return String.join(" ", Arrays.copyOf(s.split(" "), k));
    }
}
