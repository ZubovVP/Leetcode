package org.zubov.solutions.easy;

public class MaximumNumberOfWordsFoundInSentences {
    public static int mostWordsFound(String[] sentences) {
        int result = 0;
        for (String sentence : sentences) {
            int countOfWords = sentence.trim().split(" ").length;
            if (result < countOfWords) {
                result = countOfWords;
            }
        }
        return result;
    }
}
