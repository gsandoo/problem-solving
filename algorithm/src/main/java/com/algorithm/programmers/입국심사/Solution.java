package com.algorithm.programmers.입국심사;

import java.util.Arrays;

public class Solution {
    public static long solution(int n, int[] times) {
        Arrays.sort(times); // 오름차 순 정렬. 시간이 적은 심사대 부터 심사 받기 위해
        long min = 1 ; // 최소 1분이라 가정

        long max = (long)times[times.length-1] * n ; // 가장 오래 걸리는 심사대 * n 이 최댓값
        long sum; long mid = 0; long answer = 0;

        while (min <= max){
            mid = (min + max) / 2;
            sum = 0;
            for (int time : times) sum += mid / time; // mid 시간 안에 입국 심사를 진행할 수 있는 수
            if (sum >= n){
                answer = mid; // 만약 n명보다 sum이 같거나 많다면 최소 시간을 더 줄일 수 있다는 뜻
                max = mid - 1;
            }else{
                min = mid +1; // 만약 n명보다 sum이 작다면 최소 시간을 늘려야 한다는 뜻
            }
        }
        return answer;
    }
}
