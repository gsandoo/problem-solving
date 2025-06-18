package com.algorithm.kakaoTech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄: N, M, x
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 나무의 개수
        int M = Integer.parseInt(st.nextToken()); // 벌목 높이 제한
        int x = Integer.parseInt(st.nextToken()); // 초기 위치

        // 두 번째 줄: H1, H2, ..., HN
        long[] H = new long[N + 1]; // 1-based indexing
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            H[i] = Long.parseLong(st.nextToken());
        }

        // 세 번째 줄: Q
        int Q = Integer.parseInt(br.readLine().trim()); // 벌목 반복 횟수

        // 네 번째 줄: D1, D2, ..., DQ
        st = new StringTokenizer(br.readLine());
        char[] D = new char[Q];
        for(int i = 0; i < Q; i++) {
            if(st.hasMoreTokens()) {
                D[i] = st.nextToken().charAt(0);
            } else {
                // 만약 지시가 부족하다면, 기본적으로 'S'로 처리
                D[i] = 'S';
            }
        }

        // 벌목 시뮬레이션
        long growthCount = 0; // 전체 성장 횟수
        long wood = 0; // 소지한 목재량
        long[] lastCut = new long[N + 1]; // 각 나무가 마지막으로 벌목된 시점

        // 초기화: 모든 나무의 lastCut을 0으로 설정 (벌목 전)
        for(int i = 1; i <= N; i++) {
            lastCut[i] = 0;
        }

        // 현재 위치
        int currentPos = x;

        // 벌목 과정 반복
        for(int i = 0; i < Q; i++) {
            // 1. 성장: 모든 나무의 높이가 1씩 증가
            growthCount += 1;

            // 2. 벌목 시도
            long currentHeight = H[currentPos] + (growthCount - lastCut[currentPos]);
            if(currentHeight >= M) {
                wood += currentHeight;
                H[currentPos] = 0; // 벌목 후 높이 0
                lastCut[currentPos] = growthCount; // 마지막 벌목 시점 갱신
            }

            // 3. 이동
            char command = D[i];
            if(command == 'L') {
                currentPos = (currentPos == 1) ? N : currentPos - 1;
            }
            else if(command == 'R') {
                currentPos = (currentPos == N) ? 1 : currentPos + 1;
            }
            // 'S'인 경우는 위치 변경 없음
        }

        // 결과 출력
        System.out.println(wood);
    }
}

