package com.algorithm.inflearn.배열;
import java.util.*;

// 뒤집은 소수
public class q6 {

    public boolean isPrime(int num){
       if (num == 1 ) return  false;
       for (int i = 2; i < num ; i++){
           if (num % i == 0) return  false;
       }return  true;
    };
    public ArrayList<Integer> solution(int N , int[] s) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0 ; i < N ; i++){
            int tmp = s[i];
            int rev = 0;
            while (tmp > 0){
                int t = tmp % 10;
                rev = rev * 10 + t ;
                tmp  = tmp /10;
            }if (isPrime(rev)) answer.add(rev);
        }
        return  answer;
    }

    public static void main(String[] args) {
        q6 T = new q6();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] s = new int[N];
        for (int i = 0 ; i < N ; i++){
            s[i] = kb.nextInt();
        }
        for (int x: T.solution(N , s)
             ) {
            System.out.print(x + " ");
        }

    }
}
