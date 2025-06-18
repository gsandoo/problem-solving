/**
 * Author    : Kang San Ah
 * Date      : 2024.11.19(tue)
 * Runtime   : 1 sec
 * Memory    : 256 MB
 * Key point : 스택 가장 기본 문제
 * Algorithm : 스택
 */

package com.algorithm.inflearn.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호문자제거 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (char x : line.toCharArray()){
            if (x == ')'){
                while (!(stack.lastElement() =='(')) stack.pop();
                stack.pop();
            }else{
                stack.push(x);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.peek());
            stack.pop();
        }
        System.out.println(sb.reverse().toString());
    }
}
