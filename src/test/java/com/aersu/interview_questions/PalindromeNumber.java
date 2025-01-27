package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder num = new StringBuilder(); // add number to string builder, don't have to get the value of
        StringBuilder numRev = new StringBuilder(); //use for adding and reversing
        num.append(x);
        numRev.append(x);
        numRev.reverse();

        //use content equals or toString equals
        return num.toString().contentEquals(numRev);

    }

    @Test
    void test() {
        Assertions.assertTrue(isPalindrome(55));

    }


    @Test
    void test2() {
        Assertions.assertFalse(isPalindrome(5456));

    }

    @Test
    void test3() {
        Assertions.assertFalse(isPalindrome(-324));

    }
}
