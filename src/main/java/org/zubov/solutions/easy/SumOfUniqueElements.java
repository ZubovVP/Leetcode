package org.zubov.solutions.easy;

public class SumOfUniqueElements {
    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int numOne = nums[i];
            int numTwo = 0;
            for (int j = 0; j < nums.length; j++) {
                if (numOne == nums[j] && j != i) {
                    numTwo = nums[j];
                    break;
                }
            }
            if (numTwo == 0) {
                sum += numOne;
            }
        }
        return sum;
    }
}
