package com.algorithm.ktb.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < N ; i++) {
            String[] str = br.readLine().split(" ");
            switch (str[0]){
                case "push":
                    q.offer(Integer.parseInt(str[1]));
                    break;
                case "front":
                    if (!q.isEmpty()) sb.append(q.peek()).append("\n");
                    else sb.append(-1).append("\n");;
                    break;
                case "back":
                    if (!q.isEmpty()) sb.append(((LinkedList<Integer>) q).getLast()).append("\n");
                    else sb.append(-1).append("\n");;
                    break;
                case "pop":
                    if (!q.isEmpty()) sb.append(q.poll()).append("\n");
                    else sb.append(-1 ).append("\n");;
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if (!q.isEmpty()) sb.append( 0).append("\n");
                    else sb.append(1).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
