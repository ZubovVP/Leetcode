package org.zubov.solutions.easy;

public class FibonacciNumber {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int prevNum = 0;
        int num = 1;
        int result = 0;
        for (int i = 1; i < n; i++) {
            result = num + prevNum;
            prevNum = num;
            num = result;
        }
        return result;
    }
}
