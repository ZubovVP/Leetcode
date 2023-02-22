package org.zubov.solutions.easy;

public class SmallestEvenMultiple {
    public static int smallestEvenMultiple(int n) {
        int num = n;
        while (true) {
            if (num % n == 0 && num % 2 == 0) {
                return num;
            } else {
                num++;
            }
        }
    }
}
