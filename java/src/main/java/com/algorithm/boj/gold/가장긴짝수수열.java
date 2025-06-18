package com.algorithm.boj.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가장긴짝수수열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        String[] numbers = br.readLine().split(" ");
        int[] arr = new int[n];

        // 0 = 짝수, 1 = 홀수
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(numbers[i]);
            arr[i] = num % 2; // 홀수는 1, 짝수는 0으로 저장
        }

        int l = 0, r = 0, oddCount = 0, maxLength = 0;

        while (r < n) {
            // 오른쪽 포인터를 이동하며 홀수 개수를 카운트
            if (arr[r] == 1) {
                oddCount++;
            }
            r++;

            // 홀수 개수가 k를 초과하면 왼쪽 포인터를 이동
            while (oddCount > k) {
                if (arr[l] == 1) {
                    oddCount--;
                }
                l++;
            }

            // 짝수 부분의 길이를 계산
            maxLength = Math.max(maxLength, r - l);
        }

        System.out.println(maxLength);
    }
}
