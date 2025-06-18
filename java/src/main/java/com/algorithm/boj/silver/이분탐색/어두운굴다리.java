package com.algorithm.boj.silver.이분탐색;

import java.io.*;
import java.util.*;

public class 어두운굴다리 {
    static int N, M;
    static int[] lights;

    static int[][] na = {{1,2,3}, {2,5}, {3,2,1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 굴다리 길이
        M = Integer.parseInt(br.readLine()); // 가로등 개수
        lights = new int[M];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            lights[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lights);

        int left = 1;
        int right = N;
        int answer = N;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (check(mid)) {
                answer = mid;
                right = mid - 1; // 더 작은 D를 찾아본다
            } else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }

    static boolean check(int D) {
        int prev = 0; // 지금까지 밝힌 가장 오른쪽 위치

        for (int i = 0; i < M; i++) {
            int start = lights[i] - D;
            int end = lights[i] + D;

            // 이 가로등의 왼쪽 범위가 어두운 구간이면 실패
            if (start > prev) return false;

            prev = Math.max(prev, end); // 새로 밝힌 범위까지 확장
        }

        return prev >= N; // 끝까지 밝히면 성공
    }
}
