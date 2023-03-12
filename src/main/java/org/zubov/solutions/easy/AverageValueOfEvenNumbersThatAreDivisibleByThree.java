package org.zubov.solutions.easy;

public class AverageValueOfEvenNumbersThatAreDivisibleByThree {
    public static int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            if (num % 3 == 0 && num % 2 == 0) {
                sum += num;
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }
}
