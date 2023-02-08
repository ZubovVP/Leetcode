package org.zubov.solutions.easy;

public class FinalValueOfVariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if (operation.startsWith("-") || operation.endsWith("-")) {
                result -= 1;
            } else {
                result  += 1;
            }
        }
        return result;
    }
}
