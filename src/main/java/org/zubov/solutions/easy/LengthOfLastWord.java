package org.zubov.solutions.easy;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }

        char[] chars = s.toCharArray();
        short counter = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                if (counter > 0) {
                    return counter;
                }
            } else {
                counter++;
            }
        }
        return counter;
    }
}
