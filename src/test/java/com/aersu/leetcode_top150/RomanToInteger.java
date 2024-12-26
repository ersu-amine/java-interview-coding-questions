package com.aersu.leetcode_top150;

import org.junit.jupiter.api.Test;

public class RomanToInteger {
    public int romanToInteger(String s) {
        //s += "0"; //add zero to end to prevent for loop going out of bound
        String[] split = s.split("");
        int number = 0; //no zero or negative numbers in roamn numerals

        for (int i = 0; i < split.length; i++) {
            //(i) should be less than the last index to prevent going out of bounds
            if (i < split.length-1 && symbolToInteger(split[i]) < symbolToInteger(split[i + 1]) ) {
                number -= symbolToInteger(split[i]);
            } else {
                number += symbolToInteger(split[i]);
            }
        }

        return number;
    }

    public int symbolToInteger(String s) {
        int number = 0;
        if (s.length() == 1) {
            switch (s.toUpperCase()) {
                case "I":
                    number = 1;
                    break;
                case "V":
                    number = 5;
                    break;
                case "X":
                    number = 10;
                    break;
                case "L":
                    number = 50;
                    break;
                case "C":
                    number = 100;
                    break;
                case "D":
                    number = 500;
                    break;
                case "M":
                    number = 1000;
                    break;
                default:
                    break;
            }
        }
        return number;
    }

    @Test
    void test1() {
        System.out.println("romanToInteger('III') = " + romanToInteger("III"));
    }

    @Test
    void test2() {
        System.out.println("romanToInteger('LVIII') = " + romanToInteger("LVIII"));
    }

    @Test
    void test3() {
        System.out.println("romanToInteger('MCMXCIV') = " + romanToInteger("MCMXCIV"));
    }
}

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */