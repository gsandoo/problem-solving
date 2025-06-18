package com.algorithm.programmers.일반문제;

import java.util.Arrays;

public class Solution {
    public String solution(int[] numbers) {
        String[] stringArr = new String[numbers.length];

        for (int i  = 0 ; i < numbers.length; i ++){
            stringArr[i] = String.valueOf(numbers[i]); // stringArr = ["6" , "10" , "2"]
        }

        Arrays.sort(stringArr, (o1, o2) -> (o2+o1).compareTo(o1+o2)); // ["6" , "2" , "10"]

        if (stringArr[0].equals("0")) return "0"; // 조건

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < stringArr.length; i++){
            sb.append(stringArr[i]); // "6210"
        }

        return sb.toString(); // 문자열 변환

    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] ask = new int[]{6, 10, 2};
        System.out.println(s.solution(ask));
    }
}

