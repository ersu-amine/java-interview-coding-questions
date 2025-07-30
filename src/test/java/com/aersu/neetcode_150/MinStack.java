package com.aersu.neetcode_150;

import java.util.Stack;

class MinStack{
    Stack<Integer> newMin;

    public MinStack() {
        newMin = new Stack<Integer>();
    }

    public void push(int val) {
        newMin.push(val);
    }

    public void pop() {
        newMin.pop();
    }

    public int top() {
        return newMin.peek();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(Integer each:newMin){
            if(each<min){
                min = each;
            }
        }
        return min;
    }
}
