package com.algorithm.study.week2;

import java.util.Scanner;

// 2021 카카오 인턴십 - 숫자 문자열과 영단어
public class week2_3 {
    public int solution(String s) {
        String t="";
        int answer ;
       while (s.length() >= 1){
            if (s.charAt(0)=='z'){
                t += '0' ;
                s=s.substring(4);
            } else if (s.charAt(0)=='o') {
                t += '1';
                s=s.substring(3);
            } else if (s.charAt(0)=='t') {
                if (s.charAt(0+1)=='w'){
                    t += '2';
                    s=s.substring(3);
                }else {
                    t += '3';
                    s=s.substring(5);
                }
            }else if (s.charAt(0)=='f') {
                if (s.charAt(0+1)=='o'){
                    t += '4';
                }else {
                    t += '5';
                }
                s=s.substring(4);
            }else if (s.charAt(0)=='s') {
                if (s.charAt(0+1)=='i'){
                    t += '6';
                    s=s.substring(3);
                }else {
                    t += '7';
                    s=s.substring(5);
                }
            }else if (s.charAt(0)=='e') {
                t += '8';
                s=s.substring(5);
            }else if (s.charAt(0)=='n') {
                t += '9';
                s=s.substring(4);
             }else{
                t += s.charAt(0);
                s = s.substring(1);
            }
        }
        try {
            answer  = Integer.parseInt(t);
        }catch (NumberFormatException x){
            x.printStackTrace();
            answer = 0;
        }
        return answer;
    };

    public static void main(String[] args) {
        week2_3 T = new week2_3();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }

}
