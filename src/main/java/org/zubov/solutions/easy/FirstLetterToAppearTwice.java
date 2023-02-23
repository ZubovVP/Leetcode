package org.zubov.solutions.easy;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice {
    public static char repeatedCharacter(String s) {
        Set<Character> chars = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (chars.contains(c)) {
                return c;
            }
            chars.add(c);
        }
        return 0;
    }
}
