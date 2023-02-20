package org.zubov.solutions.easy;

public class CheckIfStringIsAPrefixOfArray {
    public static boolean isPrefixString(String s, String[] words) {
        for (String word : words) {
            if (s.length() == 0) {
                return true;
            }
            if (s.startsWith(word)) {
                s = s.substring(word.length());
            } else {
                return false;
            }
        }
        return s.length() == 0;
    }
}
