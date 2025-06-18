package com.algorithm.inflearn.section5.학급회장;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class q1 {
    public boolean Solution(List<String>list){
        Stack<Character> stack = new Stack<>();

        for (String x: list
        ) {
            if (x.equals(")")) {
                if (isEmpty(stack)== true)return false;
                else {
                    stack.pop();
                }
            }

        }
        return true;
    }

    private boolean isEmpty(Stack<Character> stack){
        if (stack.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        q1 q1 = new q1();
        List<String> list  = new ArrayList<>();
        list.add("(");
        list.add("(");
        list.add("(");
        list.add(")");
        list.add(")");
        list.add(")");
        list.add(")");
        System.out.println(q1.Solution(list));
    }
}
