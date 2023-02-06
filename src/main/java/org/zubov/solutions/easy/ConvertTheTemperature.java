package org.zubov.solutions.easy;

public class ConvertTheTemperature {
    public static double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.8 + 32};
    }
}