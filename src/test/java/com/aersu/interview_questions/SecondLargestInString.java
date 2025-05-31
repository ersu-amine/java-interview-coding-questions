package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInString {
    /*
     Second Largest Digit in a String:
        For example, if the input is "str1025rts", you need to find and return the digit 2.

     */
    public int findSecondLargestNum(String str){
        List<Integer> digits = new ArrayList<>();
        for (char each : str.toCharArray() ) {
            if (Character.isDigit(each)){
                //convert string to digit
               digits.add(Integer.parseInt(each+"")); //parseInt method accepts string, concatenation with empty string make char into String
            }
        }
        Collections.sort(digits);//sort in numerical order
        return digits.get(digits.size()-2);
    }

    @Test
    void test() {
        Assertions.assertEquals(3,findSecondLargestNum("May31June6"));
    }
}
