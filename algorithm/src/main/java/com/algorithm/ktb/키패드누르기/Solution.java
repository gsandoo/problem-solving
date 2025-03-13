package com.algorithm.ktb.키패드누르기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

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

        for (int n : numbers){
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

}
