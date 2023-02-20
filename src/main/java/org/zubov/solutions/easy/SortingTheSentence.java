package org.zubov.solutions.easy;

public class SortingTheSentence {
    public static String sortSentence(String s) {
        String[] sArray = s.split(" ");
        String[] words = new String[sArray.length];
        for (String word : sArray) {
            words[Integer.parseInt(word.substring(word.length() - 1)) - 1] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", words);
    }
}
