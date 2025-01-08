package com.aersu.leetcode_top150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefix {
    /*
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".



    Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
     */

    public String longestCommonPrefix(String[] strs) {

        if(strs.length==1){
            return strs[0];
        }

        StringBuilder result = new StringBuilder();
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if(str.length()< minLength){
                minLength = str.length();
            }
        }

        for (int i = 0; i < minLength; i++) {
            String letter = "";
            for (int j = 0; j < strs.length-1; j++) {
                if(strs[j].charAt(i)==strs[j+1].charAt(i)){
                    letter = "" + strs[j].charAt(i);
                }else{
                    return result.toString();
                }
            }
            result.append(letter);
        }
        return result.toString();
    }

    @Test
    void test() {
        String [] strs = new String[]{"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
        Assertions.assertEquals("fl",longestCommonPrefix(strs));
    }


    @Test
    void test2() {
        String [] strs = new String[]{"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strs));
        Assertions.assertEquals("",longestCommonPrefix(strs));
    }

    @Test
    void test3() {
        String [] strs = new String[]{"a"};

        System.out.println(longestCommonPrefix(strs));
        Assertions.assertEquals("a",longestCommonPrefix(strs));
    }
}
