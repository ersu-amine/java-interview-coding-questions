package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberOfNonSpace {
    /*
    String count of non-space chracter: Write a program to calculate the count of non-space characters in a string.

        Input: This is a string
        Output: 13
     */

    public static int numNonSpace(String str){
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        //Collections.replaceAll(list," ", null);
        list.removeIf(item -> item.equals(" "));

        return list.size();
    }

    @Test
    void test() {
        Assertions.assertEquals(13, numNonSpace("This is a string"));
        Assertions.assertEquals(31, numNonSpace("I take my coffee with sugar and cream."));
    }
}
