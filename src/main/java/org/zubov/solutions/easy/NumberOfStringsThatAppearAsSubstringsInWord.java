package org.zubov.solutions.easy;

public class NumberOfStringsThatAppearAsSubstringsInWord {

    public static int numOfStrings(String[] patterns, String word) {
        int counter = 0;
        for (String el : patterns) {
            if(word.contains(el)){
                counter++;
            }
        }
        return counter;
    }

}
