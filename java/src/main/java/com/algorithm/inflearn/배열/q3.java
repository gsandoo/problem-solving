package com.algorithm.inflearn.배열;
import java.util.*;

public class q3 {
    public String[] solution(int[] s, int[] s2, int n) {
        String[] answer = new String[n] ;
        for (int i = 0 ; i < n ; i++){
                if (s[i] == s2[i]){
                    answer[i] = "D";
                }else if(s[i]==2 && s2[i]==1){
                    answer[i] = "A";
                }else if(s[i]==3 && s2[i]==1){
                    answer[i] = "B";
                }else if(s[i]==1 && s2[i]==2){
                    answer[i] = "B";
                }else if(s[i]==3 && s2[i]==2){
                    answer[i] = "A";
                }else if(s[i]==1 && s2[i]==3){
                    answer[i] = "A";
                }else if(s[i]==2 && s2[i]==3){
                    answer[i] = "B";
                }
        }
        return  answer;
    }

    public static void main(String[] args) {
        q3 T = new q3();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for (int i = 0 ; i < N ; i++){
            arr[i] = kb.nextInt();
        }
        for (int i = 0 ; i < N ; i++){
            arr2[i] = kb.nextInt();
        }
        for (String x:T.solution( arr, arr2 , N )
             ) {
            System.out.println(x);
        }
    }
}
