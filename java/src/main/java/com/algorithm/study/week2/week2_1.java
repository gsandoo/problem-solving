package com.algorithm.study.week2;

import java.util.Scanner;

// 문자열
public class week2_1 {
    public int solution(String x , String y) {
        int answer=0 , count = Integer.MIN_VALUE;
        if (x.length() != y.length()){
            for (int i = 0 ; i < y.length()-x.length()+1; i++){
                int s = 0, yt = i;
                for (int xt = 0  ; xt < x.length() ; xt++){
                    if (y.charAt(yt)==x.charAt(xt)){
                        s++;
                        yt++;
                        continue;
                    }
                    yt++;
                }
                count = Integer.max(count,s);
            }
            answer = x.length()-count;
        }else{
            for (int i  = 0 ; i < y.length() ; i ++){
                if (x.charAt(i)!= y.charAt(i)) answer++;
            }
        }
        return  answer;
    };

    public static void main(String[] args) {
        week2_1 T = new week2_1();
        Scanner kb = new Scanner(System.in);
        String x = kb.next();
        String y = kb.next();
        System.out.println(T.solution(x, y));
    }
}
