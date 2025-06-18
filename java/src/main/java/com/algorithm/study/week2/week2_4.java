package com.algorithm.study.week2;

import java.util.Scanner;

// 문자열 나누기
public class week2_4 {

    public int solution(String s) {
        int answer = 0 ,lt = 0  ,c = 1 , nc=0 ;
        if (s.length() <= 1) {
            answer++;
            return answer;
        }
        for (int rt = 1  ; rt < s.length() ; rt++){
            char x = s.charAt(lt);
            if (x != s.charAt(rt))nc++;
            else c++;
            if (c == nc){
                answer++;
                s = s.substring(rt+1);
                rt=0;
                c=1;
                nc=0;
            }
        }
        if (s.length() >=1 ) answer++;
        return  answer;
    };

    public static void main(String[] args) {
        week2_4 T = new week2_4();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
        }
    }

