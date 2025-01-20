package com.algorithm.inflearn.동적계획법dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최대부분증가수열LIS {

    static int[] dy;

    public static int solution(int[]arr){

        dy[0] = 1;
        int answer = 0;
        for (int i = 1 ; i <= arr.length;i++){
            int max = 0;
            for (int j = 0; j < i; j++){
                if (arr[j] < arr[i] && dy[j] > max) {
                    max = dy[j];
                }
                dy[i] = max + 1;
            }
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solution(arr));
    }
}
