package com.algorithm.study.week3;
import java.util.*;

public class lotto {
    public String solution(int[] lottos, int[] win_nums) {
        int[] arr = new int[2] ; int max = 0 ; int min = 0 ; int count =0;
        HashMap<Integer,Integer> rank = new HashMap<>();
        int p = 6;
        for (int i = 1 ; i <= 6  ; i++){
            rank.put(p-- , i);
        }
        //max
        for (int i = 0 ; i < lottos.length ; i++ ) {
            if (lottos[i]==0){
                count++;
                continue;
            }
            for (int j = 0 ; j < win_nums.length ; j++){
                if (lottos[i]==win_nums[j]){count++;}
            }
        }
        if (count ==1 || count==0)arr[0]=6;
        else{
            max = rank.get(count);
            arr[0]=max;
        }
        count = 0;

        for (int i = 0 ; i < lottos.length ; i++ ) {
            for (int j = 0 ; j < win_nums.length ; j++){
                if (lottos[i]==win_nums[j]){count++;}
            }
        }
        if (count ==1 || count==0)arr[1]=6;
        else{
            min = rank.get(count);
            arr[1]=min;
        }
        String answer = Arrays.toString(arr);
        return answer;
    }

    public static void main(String[] args) {
        lotto T = new lotto();
        Scanner kb = new Scanner(System.in);
        int[] lottos = new int[6];
        int[] win_nums = new int[6];
        for (int i = 0 ; i < lottos.length ; i++){
            lottos[i] = kb.nextInt();
        }
        for (int i = 0 ; i < win_nums.length ; i++){
            win_nums[i] = kb.nextInt();
        }
        System.out.println(T.solution(lottos ,win_nums));
    }
}
