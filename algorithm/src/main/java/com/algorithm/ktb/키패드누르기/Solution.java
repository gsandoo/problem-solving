package com.algorithm.ktb.키패드누르기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    static int[] arr = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
    static int[][] keypad = {
            {3, 1}, // 0번
            {0, 0}, {0, 1}, {0, 2},
            {1, 0}, {1, 1}, {1, 2},
            {2, 0}, {2, 1}, {2, 2}
    };
    static StringBuilder sb;

    public static String solution(int[] numbers, String hand) {
        sb = new StringBuilder();

        int[] leftPos = {3, 0};
        int[] rightPos = {3, 2};

        for (int n : arr){
            int[] targetPos = keypad[n];

            if (n == 1 || n == 4 || n == 7) {
                sb.append("L");
                leftPos = targetPos;
            }
            else if (n == 3 || n == 6 || n == 9) {
                sb.append("R");
                rightPos = targetPos;
            }

            // 중앙 2,5,8 일 때
            // 3 = {0,2}
            // 4 = {1,0}
            // 5 = {1,1}

            else{
                int left = Math.abs(leftPos[0] - targetPos[0]) + Math.abs(leftPos[1] - targetPos[1]);
                int right = Math.abs(rightPos[0] - targetPos[0]) + Math.abs(rightPos[1] - targetPos[1]);
                if (left < right || (left == right && hand.equals("left"))){
                    sb.append("L");
                    leftPos = targetPos;
                }
                else{
                    sb.append("R");
                    rightPos = targetPos;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solution(arr, "left"));

    }
}
