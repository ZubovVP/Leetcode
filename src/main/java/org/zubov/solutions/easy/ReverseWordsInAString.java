package org.zubov.solutions.easy;

import java.util.Arrays;

public class ReverseWordsInAString {

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder wordSb;
        for (String word : s.split(" ")) {
            wordSb = new StringBuilder(word);
            result.append(wordSb.reverse());
            result.append(" ");
        }
        return result.toString().trim();
    }

}
