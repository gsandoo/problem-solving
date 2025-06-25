package com.algorithm.boj.silver.stack;

import java.io.*;
import java.util.*;

public class 스택으로수열만들기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 1;
        boolean isPossible = true;
        int idx = 0;

        while (idx < n) {

            while (num <= sequence[idx]) {
                stack.push(num++);
                sb.append("+\n");
            }

            if (stack.peek() == sequence[idx]) {
                stack.pop();
                sb.append("-\n");
                idx++;
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) System.out.print(sb);
        else System.out.println("NO");
    }
}
