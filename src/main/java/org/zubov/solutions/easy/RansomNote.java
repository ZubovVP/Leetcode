package org.zubov.solutions.easy;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();
        for (char symbol : ransomNoteChars) {
            boolean findElem = false;
            for (int i = 0; i < magazineChars.length; i++) {
                if (symbol == magazineChars[i]) {
                    magazineChars[i] = 0;
                    findElem = true;
                    break;
                }
            }
            if (!findElem) {
                return false;
            }
        }
        return true;
    }
}
