package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwapString {
    /*
    Swap two string using Substring: Write a program to swap the two strings using substring.

        Input: Hello world
        Output: World Hello
     */

    public static String swapSubstring(String str){
        //assuming that the string has exactly 2 words

        //using split method to get string array
        String firstHalf = str.split(" ")[0];
        String secondHalf = str.split(" ")[1];

        String resultWithSplit = secondHalf + " " + firstHalf;
        System.out.println("resultWithSplit = " + resultWithSplit);

        //using substring and locating the space character to navigate through it
        String resultSubstring = str.substring(str.indexOf(" ")+1) + " " +  str.substring(0, str.indexOf(" "));
        System.out.println("resultSubstring = " + resultSubstring);

        return resultSubstring;

    }

    @Test
    void test() {
        Assertions.assertEquals("Love Coffee", swapSubstring("Coffee Love"));

    }
}
