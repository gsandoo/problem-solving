package com.algorithm.inflearn.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] line = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();

        int cnt = 0;

        stack.push(line[0]);

        for (int i = 1 ; i < line.length; i++) {
            char prior = line[i-1];
            char x = line[i];
            if ( x == '(') stack.push(x);
            else {
                if (prior == ')'){
                    stack.pop();
                    cnt += 1;
                }
                else if (prior == '('){
                    stack.pop();
                    cnt += stack.size();
                }
            }
        }
        System.out.println(cnt);
    }
}
