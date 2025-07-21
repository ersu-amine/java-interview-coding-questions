package com.aersu.interview_questions;

import org.junit.jupiter.api.Test;

import java.util.*;

public class SortMapByValue {
    /*
        Write a Java program that sorts HashMap by value
     */

    public static Map<String, Integer> sortMapValue(Map<String, Integer>  map){
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();
        Set<String> keys = map.keySet();

        for (String key : keys) {
            list.add(map.get(key) + "&" + key); //concatenate value and key and add to list, can cause issues if key contains special characters
        }

        Collections.sort(list); //sort by the value

        //split and add to linked map to keep order
        for (String each : list) {
            String[] split = each.split("&");
            sortedMap.put(split[1],Integer.parseInt(split[0]));
        }

        return sortedMap;
    }


    @Test
    void test() {
        Map<String,Integer> map = new HashMap<>();
        map.put("Devil May Cry", 2013);
        map.put("Prince of Persia : Warrior Within", 2004);
        map.put("Assassin's Creed", 2007);
        map.put("Tenchu", 1998);
        map.put("Super Mario Brothers", 1985);
        map.put("Bubble Bobble", 1986);
        map.put("Metal Slug", 1996);
        System.out.println(map);
        System.out.println(sortMapValue(map));
    }
}
