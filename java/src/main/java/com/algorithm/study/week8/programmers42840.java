package com.algorithm.study.week8;

import java.util.*;

public class programmers42840 {

    public int[] solution(int[] numbers) {
        int[] answer ={} ;
        int fcount= 0 ; int scount = 0 ; int tcount = 0;
        int[] first = {1,2,3,4,5,1,2,3,4,5};
        int[] firstarr = new int[10000];
        int[] second = {2,1,2,3,2,4,2,5,2,1};
        int[] secondarr = new int[10000];
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] thirdarr = new int[10000];
        for (int i = 0  ; i < 1000 ; i+=10){
            for (int j = 0 ; j < 10 ; j++){
                firstarr[i+j] = first[j];
                secondarr[i+j] = second[j];
                thirdarr[i+j] = third[j];
            }
        }

        for (int k = 0 ; k < numbers.length; k ++){
            if (numbers[k] == firstarr[k]) fcount++;
            if (numbers[k] == secondarr[k]) scount++;
            if (numbers[k] == thirdarr[k]) tcount++;
        }
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        hashMap.put(fcount ,1 );
        hashMap.put(scount, 2);
        hashMap.put(tcount, 3);
        int max = Integer.max(fcount,scount);
        int fmax = Integer.max(max,tcount);

        if (fcount == scount && fcount == tcount && scount == tcount) {
            answer = new int[]{1, 2 , 3};
        }else if (fcount == tcount && fcount!=0 && tcount!=0){
            answer = new int[]{1, 3};
        }  else if(scount == tcount && scount!=0 && tcount!=0){
            answer = new int[]{2,3};
        } else if (fcount == scount) {
            answer = new int[]{1,2};
        } else {
            answer= new int[]{hashMap.get(fmax)};
        }

        return answer;
    }

    public static void main(String[] args) {
        programmers42840 t1 = new programmers42840();
        int[] numbers = new int[]{5,5,5,5,5,5,5,5};
        System.out.println(t1.solution(numbers));

    }
}
