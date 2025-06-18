package com.algorithm.inflearn.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 교육과정설계 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toUpperCase().toCharArray();
        char[] plan = br.readLine().toCharArray();

        Queue<Character> q = new LinkedList<>();
        for (char x : charArr){
            q.offer(x);
        }

        Queue<Character> p = new LinkedList<>();
        for (char x : plan){
            p.offer(x);
        }

        while (!q.isEmpty()){
            char qp = q.peek();
            char sp = p.poll();
            if (q.contains(sp)){
                if (sp == qp) q.poll();
                else {
                    System.out.println("NO");
                    break;
                }
            }
        }
        System.out.println("YES");
    }
}
