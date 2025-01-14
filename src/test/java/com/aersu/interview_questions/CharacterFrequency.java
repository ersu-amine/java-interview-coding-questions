package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

import java.util.*;

public class CharacterFrequency {
    /*
    // Code to find occurrences of each character in a given string

// Input: Amine

// Output: A: 1, m: 1, i: 1, n: 1, e:1
     */

    public static void displayFrequency(String str){
        String[] split = str.split("");

        //set has all characters
        Set<String> set = new HashSet<>(Arrays.asList(split));

        List<String> list = new ArrayList<>(Arrays.asList(split));

        for (String eachChar : set) {
            System.out.print(eachChar + ": " + Collections.frequency(list,eachChar) + ", ");
        }
    }


    public static void displayFrequency2(String str){
        String[] split = str.split("");

        Map<String,Integer> map = new HashMap<>();

        for (String each : split) {
            //if map contains key, update the value by 1
            if(map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }else{
                map.put(each,1); //add for the first time
            }
        }

        System.out.println(map); //might implement display in certain way using for loop
    }

    @Test
    void test1() {

        displayFrequency("Osmosis");
    }

    @Test
    void test2() {

        displayFrequency2("Equilibrium");
    }
}
