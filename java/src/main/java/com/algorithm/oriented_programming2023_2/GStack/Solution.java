package com.algorithm.oriented_programming2023_2.GStack;

public class Solution {
    public static void main(String[] args) {

        GStack<Integer> gStack = new GStack<Integer>();
        for (int i = 0 ; i < 10 ;  i++){
            gStack.push(i);
        }

        System.out.println(gStack.size(gStack));
//        for (int i =0 ; i < 10 ; i++){
//            System.out.println(gStack.pop());
//        }


    }
}
