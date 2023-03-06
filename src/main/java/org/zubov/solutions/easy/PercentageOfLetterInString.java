package org.zubov.solutions.easy;

public class PercentageOfLetterInString {
    public static int percentageLetter(String s, char letter) {
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (c == letter) {
                counter++;
            }
        }
        return counter > 0 ? (int) ((double) counter / s.length() * 100) : 0;
    }
}
