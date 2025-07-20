package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {
    /*
        How do you get distinct characters and their count in a string in Java?
     */

    public static Map<String,Integer> getCharacterFrequency(String str){
        Map<String,Integer> map = new HashMap<>();
        str = str.toLowerCase().replaceAll(" ", "");

        for(String each: str.split("")){
            if(!map.containsKey(each)){
                map.put(each, 1);
            }else{
                map.put(each, map.get(each) + 1); //increase frequency
            }
        }
        return map;
    }
    @Test
    void test() {
        String str = "Never lose hope";
        System.out.println(getCharacterFrequency(str));
    }
}
