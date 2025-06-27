package com.algorithm.코딩테스트.구현;

import java.io.*;
import java.util.*;

class 기차가어둠을헤치고은하수를 {
    static StringTokenizer st;
    static int N,M;
    static int[] train;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        train = new int [N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            int trainNum = Integer.parseInt(st.nextToken()) - 1;

            if (cmd == 1) {
                int seat = Integer.parseInt(st.nextToken()) - 1;
                train[trainNum] |= (1 << seat); // 승차
            } else if (cmd == 2) {
                int seat = Integer.parseInt(st.nextToken()) - 1;
                train[trainNum] &= ~(1 << seat); // 하차
            } else if (cmd == 3) {
                train[trainNum] <<= 1; // 뒤로 앉기
                train[trainNum] &= ~(1 << 20);
            } else if (cmd == 4) {
                train[trainNum] >>= 1; // 앞으로 땡겨 앉기
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int t : train) {
            set.add(t);
        }
        System.out.println(set.size());
    }
}
