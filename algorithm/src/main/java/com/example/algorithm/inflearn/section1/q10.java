package com.example.algorithm.inflearn.section1;
import java.util.Scanner;

// 가장 짧은 문자거리
public class q10 {
    public int[] solution(String s, char t ){
        int [] answer = new int[s.length()] ;
        int p = 1000;

        for (int i = 0 ; i  < s.length() ; i++){
            if (s.charAt(i)==t){
                p=0;
                answer[i] = p ;
            }
            else{
                p++;
                answer[i] = p;
            }
        }
        p = 1000;

        for (int i = s.length()-1 ; i >= 0 ; i --){
            if (s.charAt(i)==t){
                p=0;
            }
            else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        q10 T = new q10();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char t = scanner.next().charAt(0); // 문자 한개
        for (int x: T.solution(s,t)
             ) {
            System.out.print(x + " ");
        }

    }
}

