package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ReverseSegments {
    /*
    Given a word, reverse it by splitting it fragments

    Example, given word is tea

    Going from left to right
        first fragment reversed: t --> tea
        second fragment reversed: et --> eta
        third fragment reversed: aet --> aet

    Going from right to left
        first fragment reversed: a --> tea
        second fragment reversed: ae --> tae
        thirds fragment reversed: aet --> aet

    Result --> aet, alphabetically the smallest
     */
    public String findSmallest(String word) {
        String[] allStr = new String[word.length() * 2]; //store all reversed strings here
        int index = 0; //for keeping track of allStr array index

        //segments from beginning
        for (int i = 0; i < word.length(); i++) {
            String firstPart = word.substring(0, i + 1);
            String secondPart = word.substring(i + 1);

            String reversed = reverseWord(firstPart);
            allStr[index] = reversed + secondPart;
            index++;
        }

        //segments from the end
        for (int i = 0; i < word.length(); i++) {
            String firstPart = word.substring(0, i);
            String secondPart = word.substring(i);

            String reversed = reverseWord(secondPart);
            allStr[index] = firstPart + reversed;
            index++;
        }

        Arrays.sort(allStr); //sort to get the smallest one at index 0
        return allStr[0];
    }

    public static String reverseWord(String word) {
        String[] array = word.split("");
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i];
        }
        return result;

    }

    @Test
    void testReverse() {
        Assertions.assertEquals("eeffoc", reverseWord("coffee"));
        Assertions.assertEquals("i", reverseWord("i"));
    }

    @Test
    void test() {
        Assertions.assertEquals("apsce", findSmallest("space"));
    }
}
