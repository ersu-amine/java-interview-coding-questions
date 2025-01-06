package com.aersu.leetcode_top150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FirstIndexOfWordInString {
    public int findFirstOccuranceIndex(String haystack, String needle) {
        //use String built in method
        return haystack.indexOf(needle);
    }

    @Test
    void test1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        Assertions.assertEquals(0,findFirstOccuranceIndex(haystack,needle));
    }

    @Test
    void test2() {
        String haystack = "leetcode";
        String needle = "leeto";

        Assertions.assertEquals(-1,findFirstOccuranceIndex(haystack,needle));
    }
}
