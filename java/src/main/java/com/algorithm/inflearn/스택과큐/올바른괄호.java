/**
 * Author    : Kang San Ah
 * Date      : 2024.11.18(mon)
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

public class 올바른괄호 {

    public static String isVaildStack(String str){
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()){
            if (x=='(') stack.push(x);
            else{
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) answer = "NO";
        return answer;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(isVaildStack(line));
    }
}
