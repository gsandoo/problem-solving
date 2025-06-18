package com.algorithm.inflearn.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;

public class 후위식연산 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] line = br.readLine().toCharArray(); // 352+*9-
        Stack<Integer> stack = new Stack<>();

        for (char x : line){
            if (Character.isDigit(x))stack.push(x-48);
            else{
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                if (x == '-') stack.push(lt - rt);
                if (x == '*') stack.push(lt * rt);
                if (x == '/') stack.push(lt / rt);
            }
        }
        int answer = stack.pop();
        System.out.println(answer);
    }
}
