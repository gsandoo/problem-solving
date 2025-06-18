package com.algorithm.study.week3;
import java.util.ArrayList;
import java.util.Scanner;

public class n2array {
    public ArrayList<Long> solution(int n , long left, long right) {
        ArrayList<Long> answer = new ArrayList<>();
        for (long i = left ; i <= right ; i ++){
            answer.add((Math.max(i/n , i%n))+1);
        };
        return  answer;
    };

    public static void main(String[] args) {
        n2array T = new n2array();
        Scanner kb = new Scanner(System.in);
        int  n = kb.nextInt();
        int left  = kb.nextInt();
        int right  = kb.nextInt();
        System.out.println(T.solution(n , left , right));
    }
}
