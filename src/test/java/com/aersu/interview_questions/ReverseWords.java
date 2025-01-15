package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

public class ReverseWords {
    /*
    reverse order of words in a given string
     */

    public static String reverseSentence(String str){
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");//split sentence by the spaces

        for (int i = words.length-1; i >=0; i--) {
            result.append(words[i]).append(" ");
        }

        return result.toString().trim();

    }

    @Test
    void test() {
        String test = "love of coffee";
        System.out.println(reverseSentence(test));

        String test2 = " between space and time ";

        System.out.println(reverseSentence(test2));
    }
}
