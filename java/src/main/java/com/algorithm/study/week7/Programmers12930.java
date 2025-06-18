package com.algorithm.study.week7;

public class Programmers12930 {
    public String solution(String s) {
        String answer = "";

        int count =0 ;
        String [] st = s.split("");
        for (int i = 0 ; i < s.length();  i++){
            if (count % 2 ==0){
                answer += st[i].toUpperCase();
            }else{
                answer += st[i].toLowerCase();
            }
            if (st[i].equals(' ')){
                count = 0;
            }
            count ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers12930 t = new Programmers12930();
        String s = "try hello world";
        System.out.println(t.solution(s));
    }
}
