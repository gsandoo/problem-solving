package com.algorithm.ninetynine_club;


import java.util.HashMap;

public class Programmers118666 {

    //성격 유형 검사하기
    public String solution(String[] survey, int[]choices){

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0 ; i < survey.length ; i ++){

            int value = choices[i];

            if(value > 0 && value < 4) {
                char ch = survey[i].charAt(0);
                map.put(ch, map.getOrDefault(ch, 0) + 4 - value);
            } else if(value > 4) {
                char ch = survey[i].charAt(1);
                map.put(ch, map.getOrDefault(ch, 0) + value - 4);
            }

        }

        return String.valueOf(
                map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T') +
                (map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F') +
                (map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M') +
                (map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N');
    }

    public static void main(String[] args) {

        Programmers118666 programmers118666 = new Programmers118666();

        String[] survey = new String[5];
        survey[1] = "AN";
        survey[2] = "CF";
        survey[3] = "MJ";
        survey[4] = "RT";
        survey[5] = "NA";

        int[] choices = new int[5];
        choices[1] = 5;
        choices[2] = 3;
        choices[3] = 2;
        choices[4] = 7;
        choices[5] = 5;


        System.out.println(programmers118666.solution(survey,choices));



    }

}
