package com.aersu.leetcode_75;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeStringsAlternatively {
    /*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

    Return the merged string.

    Example 1:

    Input: word1 = "abc", word2 = "pqr"
    Output: "apbqcr"
    Explanation: The merged string will be merged as so:
    word1:  a   b   c
    word2:    p   q   r
    merged: a p b q c r

    Example 2:

    Input: word1 = "ab", word2 = "pqrs"
    Output: "apbqrs"
    Explanation: Notice that as word2 is longer, "rs" is appended to the end.
    word1:  a   b
    word2:    p   q   r   s
    merged: a p b q   r   s
    Example 3:

    Input: word1 = "abcd", word2 = "pq"
    Output: "apbqcd"
    Explanation: Notice that as word1 is longer, "cd" is appended to the end.
    word1:  a   b   c   d
    word2:    p   q
     */

    public static String mergeAlternatively(String word1, String word2) {
        //choose the smallest size
        int length = Math.min(word1.length(), word2.length());

        StringBuilder result = new StringBuilder();

        //all common portion of both strings are added
        for (int i = 0; i < length; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        if (word1.length() != word2.length()) {

            if (length == word1.length()) {
                //word2 is the longest
                result.append(word2.substring(length));
            }else{
                result.append(word1.substring(length));
            }
        }
        return result.toString();
    }

    @Test
    void test() {
        String word1 = "abc";
        String word2 = "pqr";

        System.out.println(mergeAlternatively(word1,word2));
        Assertions.assertEquals("apbqcr", mergeAlternatively(word1, word2));
    }

    @Test
    void test2() {
        String word1 = "ab";
        String word2 = "pqrs";

        System.out.println(mergeAlternatively(word1,word2));
        Assertions.assertEquals("apbqrs", mergeAlternatively(word1, word2));

    }

    @Test
    void test3() {
        String word1 = "abcs";
        String word2 = "pq";

        System.out.println(mergeAlternatively(word1,word2));

        Assertions.assertEquals("apbqcs", mergeAlternatively(word1, word2));
    }
}
