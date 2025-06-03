package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfWords {
    /*
    Count Word Occurrences in a Sentence:
        Given a string like "my name is Rohan Rohan", the goal is to print each word along with how many times it appears.
        "Rohan" → 2 times
        Other words → 1 time each

     */

    public void findWordFrequency(String word){
        String[] words = word.split(" "); //each word has space before or after it
        Map<String,Integer> frequency = new HashMap<>();
        for (String str : words) {
            if(frequency.containsKey(str)){
                //update frequency
                frequency.put(str, frequency.get(str) + 1);

            }else{//new word that is not in the map
                frequency.put(str,1);
            }
        }
        displayFrequency(frequency);

    }

    public static void displayFrequency(Map <String, Integer> freqMap){
        for (String word : freqMap.keySet()) {
            System.out.println("\"" + word + "->" + freqMap.get(word) + " times");
        }
    }

    @Test
    void test() {
        findWordFrequency("My name is Amine Amine Amine");
    }
}
