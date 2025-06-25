package com.algorithm.boj.silver.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드게임 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i ++) q.offer(i);

        // 핵심 로직
        while (q.size() != 1){
            q.poll(); // 가장 위 카드 버리고
            int x = q.poll(); // 다음 카드 가장 아래로 옮기기
            q.offer(x);
        }

        System.out.println(q.peek());
    }
}
