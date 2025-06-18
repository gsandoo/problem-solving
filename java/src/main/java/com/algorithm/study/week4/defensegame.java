package com.algorithm.study.week4;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class defensegame {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int my = n;
        int card = k;
        for (int i = 0; i < enemy.length; i++) {
            my -= enemy[i];
            pq.add(enemy[i]);

            if (my < 0) {
                if (card > 0 && !pq.isEmpty()) {
                    my += pq.poll();
                    card--;
                } else {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        defensegame T = new defensegame();
        int n = 7;
        int k = 3;
        int[] enemy = {4, 2, 4, 5, 3, 3, 1};
        System.out.println(T.solution(n, k, enemy));
    }
}