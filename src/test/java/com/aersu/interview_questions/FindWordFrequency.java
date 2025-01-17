package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

import java.util.*;

public class FindWordFrequency {
    /*
    Finding Word Occurrences:

    String str ="I am Java developer I am proud of it";

    // Output: Java: 1, proud: 1, of: 1, I: 2, developer: 1, it: 1, am: 2
     */

    public static void displayFrequency(String sentence){
        //split by the spaces
        String[] words = sentence.split(" ");

        //set has all words, 1 copy of each
        Set<String> set = new HashSet<>(Arrays.asList(words));

        //contains all word occurences
        List<String> list = new ArrayList<>(Arrays.asList(words));

        //display
        for (String each : set) {
            System.out.print(each + ": " + Collections.frequency(list,each) + ", ");
        }
    }
    @Test
    void name() {
        displayFrequency("To Be Or Not To Be");
    }
}
