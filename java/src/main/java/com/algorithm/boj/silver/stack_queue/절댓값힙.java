package com.algorithm.boj.silver.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class 절댓값힙 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                ((o1, o2) -> {
                    int ma = Math.abs(o1);
                    int mb = Math.abs(o2);
                    if (ma == mb) return Integer.compare(o1,o2); // 1 , -1 일 경우 -1 먼저
                    return Integer.compare(ma,mb); // 절댓 값이 작은 순대로
                }));

        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < n ; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp == 0) {
                sb.append(pq.isEmpty() ? 0 : pq.poll()).append("\n");
            } else {
                pq.offer(tmp);
            }
        }

        System.out.print(sb);
    }
}
