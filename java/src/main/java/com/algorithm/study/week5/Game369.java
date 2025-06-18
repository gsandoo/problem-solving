package com.algorithm.study.week5;

import java.util.Scanner;

public class Game369 {
    public String solution(int a){
        String answer = "";
        if (a > 0 && a < 999) {
            while (a >= 3){
                if ((a%10) % 3 ==0 ){
                    answer += "clap";
                    a = a/10;
                }else{
                    a = a/10;
                }
            }if (answer != "") return answer;
            else return "clap";
        }else{
            return "0보다 작거나 999보다 큰 수를 입력하였습니다.";
        }
    }

    public static void main(String[] args) {
        Game369 T = new Game369();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(T.solution(a));
    }
}
