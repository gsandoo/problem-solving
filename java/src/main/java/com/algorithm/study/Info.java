package com.algorithm.study;

import java.util.*;

public class Info {
        public List<Integer> solution(String today, String[] terms, String[] privacies) {
            int dayForM = 28;
            int todayY = Integer.parseInt(today.substring(0,4));
            int todayM = Integer.parseInt(today.substring(5,7));
            int todayD = Integer.parseInt(today.substring(8,10));

            int totalD = (todayY*dayForM*12) + (todayM*dayForM) + todayD;  // 2021년 * 28 * 12  +  5 * 28  +  19
            List<Integer> answerArr = new ArrayList<>();
            HashMap<Character,Integer> termsMap = new HashMap<>();
            for(String term : terms){
                char termO = term.charAt(0);
                int termM = Integer.parseInt(term.substring(2));
                termsMap.put(termO,termM);
            }
            for(int i=0; i<privacies.length; i++){
                char privacyO = privacies[i].charAt(11); // A
                int privacyY = Integer.parseInt(privacies[i].substring(0,4)); // 2021
                int privacyM = Integer.parseInt(privacies[i].substring(5,7)); // 05
                int privacyD = Integer.parseInt(privacies[i].substring(8,10)); // 02
                int totalPrivacyD = (privacyY*dayForM*12) + (privacyM*dayForM) + privacyD; // 2021*28*12 + 5*28 + 2
                int termM = termsMap.get(privacyO); // 6
                int termDay = termM * dayForM;  // 6 * 28
                if(totalPrivacyD+termDay <= totalD){
                    answerArr.add(i+1);
                }
            }

            return answerArr;
        }

    public static void main(String[] args) {
        Info T = new Info();
        String[] terms = new String[3];
        terms[0]= "A 6";
        terms[1]= "B 12";
        terms[2]= "C 3";

        String[] privacies = new String[4];
        privacies[0]= "2021.05.02 A";
        privacies[1]="2021.07.01 B";
        privacies[2]= "2022.02.19 C";
        privacies[3]="2022.02.20 C";
        System.out.println(T.solution("2022.05.19",terms,privacies));
    }
}
