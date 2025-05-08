package com.algorithm.programmers.일반문제.입국심사;

import java.util.Arrays;

public class Solution {
    public static long solution(int n, int[] times) {
        Arrays.sort(times); // 오름차 순 정렬. 시간이 적은 심사대 부터 심사 받기 위해
        long min = 1 ; // 최소 1분이라 가정

        long max = (long)times[times.length-1] * n ;
        long sum; long mid = 0; long answer = 0;

        while (min <= max){
            mid = (min + max) / 2;
            sum = 0;
            for (int time : times) sum += mid / time;
            if (sum >= n){
                answer = mid;
                max = mid - 1;
            }else{
                min = mid +1;
            }
        }
        return answer;
    }
}
