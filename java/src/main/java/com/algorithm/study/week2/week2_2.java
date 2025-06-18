package com.algorithm.study.week2;

import java.util.Scanner;

// JadenCase
public class week2_2 {
    public String solution(String s) {
        String answer = "";
        String[]str = s.toLowerCase().split("");
        boolean flag = true;
        for (String x: str
             ) {
            answer += flag ?x.toUpperCase() :x ;
            flag = x.equals(" ") ?true :false;
        }
        return answer;
    };

    public static void main(String[] args) {
        week2_2 T = new week2_2();
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        System.out.println(T.solution(s));
    }
}
