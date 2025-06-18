package com.algorithm.study;
import java.util.Scanner;
import java.util.Stack;

public class right0816 {
    public boolean solution(String b) {
        boolean answer = true ;
        int top =0;
        Stack<Character> stack = new Stack<>();
        if (b.charAt(0) == '('){
            stack.add(top,b.charAt(0));
            top++;
        }else {
            answer = false;
            return  answer;
        }
        for (int i = 1 ;  i < b.length() ; i++){
            if (b.charAt(i)=='('){
                stack.add(b.charAt(i));
                top++;
            }else{
                stack.pop();
                top--;
            }
        }
        if (!stack.isEmpty()) answer =false;
        else answer = true;
        return  answer;
    };

    public static void main(String[] args) {
        right0816 T = new right0816();
        Scanner kb = new Scanner(System.in);
        String b = kb.next();
        System.out.println(T.solution(b));
    }
}
