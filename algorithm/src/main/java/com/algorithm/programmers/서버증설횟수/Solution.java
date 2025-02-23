package com.algorithm.programmers.서버증설횟수;



public class Solution {
    public static int solution(int[] players, int m, int k) {

        int[] running = new int[24 + k];
        int answer = 0;
        int active = 0; // 현재 가동 중인 서버 수

        for (int i = 0; i < 24; i++) {

            active += running[i];

            // 필요한 서버 수 계산
            int need = players[i] / m;

            // 부족한 서버만큼 추가
            if (need > active) {
                int newServers = need - active;
                answer += newServers;
                active += newServers;

                if (i + k < running.length) {
                    running[i + k] -= newServers;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5}, 3, 5));
    }

}
