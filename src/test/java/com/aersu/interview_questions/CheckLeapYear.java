package com.aersu.interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckLeapYear {
    /*
    Check leap year: Write a program to check whether the year is leap or not.
        Input: 2020
        Output: Leap

        year is given as String
     */

    public static String checkLeapYear(String year){
        boolean result = false;
        //convert string into number
        int yearAsNum = Integer.parseInt(year);

        //divisible by 4 and divisible by 400, leap year if divisible by 100 and 400
        if (yearAsNum%100==0 && yearAsNum%400==0){
            result = true;
        }else {
            if (yearAsNum%4 == 0 && yearAsNum%100 != 0){
                result = true;
            }
        }
        return result?"Leap": "Not leap";
    }

    @Test
    void test() {
        Assertions.assertEquals("Leap",checkLeapYear("2000"));
        Assertions.assertEquals("Leap",checkLeapYear("2024"));
        Assertions.assertEquals("Not leap",checkLeapYear("2025"));
        Assertions.assertEquals("Not leap",checkLeapYear("1900"));
        Assertions.assertEquals("Not leap",checkLeapYear("2100"));


    }
}
