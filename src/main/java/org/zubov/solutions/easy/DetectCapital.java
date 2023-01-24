package org.zubov.solutions.easy;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        return checkAllUpperSymbols(chars) || checkAllLowerSymbols(chars) || checkFirstUpperAndAllLowerSymbols(chars);
    }

    private static boolean checkAllUpperSymbols(char[] chars) {
        for (char val : chars) {
            if (!Character.isUpperCase(val)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkAllLowerSymbols(char[] chars) {
        for (char val : chars) {
            if (!Character.isLowerCase(val)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkFirstUpperAndAllLowerSymbols(char[] chars) {
        if (Character.isUpperCase(chars[0])) {
            for (int i = 1; i < chars.length; i++) {
                if (!Character.isLowerCase(chars[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
