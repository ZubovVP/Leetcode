package org.zubov.solutions.easy;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static int subtractProductAndSum(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int product = 1;
        int sum = 0;
        for (int number : chars) {
            n = Character.getNumericValue(number);
            product *= n;
            sum += n;
        }
        return product - sum;
    }

}
