package com.algorithm.programmers.일반문제.택배상자;


import java.util.Stack;

public class Solution {
    public static int solution(int[] order) {
        int answer = 0;
        int[] priority = new int[order.length];

        for (int i = 0; i < order.length; i++) {
            priority[order[i] - 1] = i;
        }

        Stack<Integer> stack = new Stack<>();

        int target = 0;

        for(int i = 0; i < priority.length; i++){
            if(priority[i] == target){
                target++;
            }else{
                stack.push(priority[i]);
            }
            while(!stack.isEmpty() && stack.peek() == target){
                stack.pop();
                target++;
            }
        }
        return target;
    }


    public static void main(String[] args) {
        int[] order = new int[5];
        order[0] = 4;
        order[1] = 3;
        order[2] = 1;
        order[3] = 2;
        order[4] = 5;


        System.out.println(solution(order));

    }
}
