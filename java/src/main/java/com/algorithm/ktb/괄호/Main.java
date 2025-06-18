package com.algorithm.ktb.괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < N; i++) {
            char[] arr = br.readLine().toCharArray();
            boolean flag = false;

            for (char x : arr){
                if (st.isEmpty())st.push(x);
                else{
                    // 괄호가 형성되면
                    if (x == ')' && st.peek() == '(') st.pop();
                    else st.push(x);
                }
            }
            if (st.isEmpty()) sb.append("YES" + '\n');
            else sb.append("NO" + '\n');
            st.clear();
        }

        System.out.println(sb);
    }
}
