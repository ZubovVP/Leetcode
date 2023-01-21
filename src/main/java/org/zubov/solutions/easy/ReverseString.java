package org.zubov.solutions.easy;

public class ReverseString {

    public static void reverseString(char[] s) {
        char elem;
        for (int i = 0; i < Math.floor(s.length / 2); i++) {
            elem = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = elem;
        }
    }
}
