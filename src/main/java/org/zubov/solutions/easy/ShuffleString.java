package org.zubov.solutions.easy;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        String[] strings = s.split("");
        StringBuilder sb = new StringBuilder();
        for (int counter = 0; counter < indices.length; ) {
            for (int i = 0; i < indices.length; i++) {
                if (counter == indices[i]) {
                    sb.append(strings[i]);
                    counter++;
                    break;
                }
            }
        }
        return sb.toString();
    }
}
