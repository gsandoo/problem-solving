package com.algorithm.study;

import java.util.ArrayList;
import java.util.Scanner;

public class duramuri0816 {
    public String solution(int m , String s , String b) {
        String answer = "" ;
        String bb = String.valueOf(b.charAt(0))+s.charAt(b.length()-1);
        String ss = String.valueOf(s.charAt(0))+s.charAt(s.length()-1);
        String aeiou = "aeiou";
        char[] a = aeiou.toCharArray();

        ArrayList<Character> c = new ArrayList<>();

        if (!bb.equals(ss)) return "YES";
        else {
            for (int i = 0 ; i <m ; i ++){
                if (s.charAt(i) != b.charAt(i)){
                    c.add(s.charAt(i));
                    c.add(b.charAt(i));
                }else answer = "YES";
            }
            boolean flag = false;
            for (int i= 0 ; i < c.size() ; i++){
                for (int j = 0 ; j < a.length; j++){
                    if (c.get(i) == a[j]) flag = true;
                    else flag = false;
                    if (!flag) return  "NO";
                }
            }
            if (flag) answer ="YES";
            else  answer = "NO";
        }
        return  answer;
    };

    public static void main(String[] args) {
        duramuri0816 T = new duramuri0816();
        Scanner kb = new Scanner(System.in);
        int m  = kb.nextInt();
        String s = kb.next();
        String b = kb.next();
        if (s.length() == m && b.length()==m) {
            System.out.println(T.solution(m, s, b));
        }else  return;
    }
}
