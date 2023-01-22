package org.zubov.solutions.easy;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            }
        }
        if (digits[0] == 10) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            newArray[1] = 0;
            for (int i = 2; i < newArray.length; i++) {
                newArray[i] = digits[i - 1];
            }
            return newArray;
        }
        return digits;
    }
}
