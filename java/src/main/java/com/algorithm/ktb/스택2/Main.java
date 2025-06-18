package com.algorithm.ktb.스택2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0 ; i < N; i++) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(stz.nextToken());
            switch (command) {
                case 1:
                    if (stz.hasMoreTokens()) {
                        st.push(Integer.parseInt(stz.nextToken()));
                    }
                    break;
                case 2:
                    sb.append(st.isEmpty() ? -1 : st.pop()).append("\n");
                    break;
                case 3:
                    sb.append(st.size()).append("\n");
                    break;
                case 4:
                    sb.append(st.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 5:
                    sb.append(st.isEmpty() ? -1 : st.peek()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
