package com.aersu.neetcode_150.arrays_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ValidAnagram {
    //solving using sort method
    public boolean isAnagram(String s, String t) {

        if(s.length() == t.length()){
            String [] str = s.split("");
            String [] str2 = t.split("");

            Arrays.sort(str);
            Arrays.sort(str2);

            return Arrays.equals(str,str2);
        }
        else{
            return false;
        }

    }

    @DisplayName("valid anagram")
    @Test
    void test1() {
        String s1 = "racecar";
        String s2 = "carrace";

        Assertions.assertTrue(isAnagram(s1,s2));
    }


    @DisplayName("invalid anagram")
    @Test
    void test2() {
        String s1 = "cat";
        String s2 = "car";

        Assertions.assertFalse(isAnagram(s1,s2));
    }
}
