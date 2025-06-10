package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class FindDuplicateChars {
    /*
    Find duplicate char from string. Write a program to find duplicate characters in a given String.

        Input: hackerearth
        Output: h a e r
     */

    public static String duplicatedCharacters(String str) {
        str=str.toLowerCase();

        Set<String> characters = new HashSet<>(); //for containing all characters, no duplicates
        Set<String> duplicates = new HashSet<>(); //for duplicated chars, will have single copy

        for (String letter : str.split("")) {

            if (!characters.contains(letter)) {
                characters.add(letter);
            } else {
                duplicates.add(letter);
            }
        }

        //The new String[0] is a common idiom — it tells toArray() what type of array to create.
        //otherwise it will return Object[]
        String[] array = duplicates.toArray(new String[0]);
        System.out.println(String.join("", array));

        return String.join("", array);
    }

    @Test
    void test() {
        Assertions.assertEquals("pa",duplicatedCharacters("papatya"));
    }

}
