package com.aersu.leetcode_75;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GreatestCommonDivisorString {
    /*
    For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

    Example 1:

    Input: str1 = "ABCABC", str2 = "ABC"
    Output: "ABC"
    Example 2:

    Input: str1 = "ABABAB", str2 = "ABAB"
    Output: "AB"
    Example 3:

    Input: str1 = "LEET", str2 = "CODE"
    Output: ""

     */
    public String gcdOfStrings(String str1, String str2) {
        //split with same size as second string
        String str3 = str1.substring(0, str2.length());
        String remainder = str1.substring(str2.length());

        String result = "";

        if (str3.equals(str2)) {
            String str4 = str2.substring(0,remainder.length());
            if (str4.equals(remainder)){
                result =remainder;
            }

        }

        return result;
    }

    @Test
    void test1() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        Assertions.assertEquals("ABC",gcdOfStrings(str1, str2));
    }


    @Test
    void test2() {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        Assertions.assertEquals("AB",gcdOfStrings(str1, str2));
    }


    @Test
    void test3() {
        String str1 = "COFF";
        String str2 = "EE";

        Assertions.assertEquals("",gcdOfStrings(str1, str2));
    }

    @Test
    void test4() {
        String str1 = "ABCDEF";
        String str2 = "ABC";

        Assertions.assertEquals("",gcdOfStrings(str1, str2));
    }
}
