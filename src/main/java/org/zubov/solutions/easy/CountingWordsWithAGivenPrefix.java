package org.zubov.solutions.easy;

public class CountingWordsWithAGivenPrefix {
    public static int prefixCount(String[] words, String pref) {
        int counter = 0;
        for (String word : words) {
            if(word.startsWith(pref)){
                counter++;
            }
        }
        return counter;
    }
}
