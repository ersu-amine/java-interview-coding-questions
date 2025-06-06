package com.aersu.leetcode_top150;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class BuySellStock {
    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
     */

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0; //difference between max and min

        for (int j = 0; j < prices.length; j++) {
            if (min > prices[j]) {
                min = prices[j];
            }else if (profit< prices[j] - min){
                //update profit
                profit = prices[j] - min;
            }
        }


        return profit;
    }

    @Test
    void test1() {

        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));

    }

    @Test
    void test2() {

        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

    }
}
