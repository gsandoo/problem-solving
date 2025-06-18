package com.algorithm.study.week8;

import java.util.*;

public class programmers12915 {

        public String[] solution(String[] strings, int n) {
            Arrays.sort(strings);
            String[] answer = new String[strings.length];

            for(int i = 0; i < strings.length; i++) {
                answer[i] = strings[i].substring(n, n+1);
            }
            Arrays.sort(answer);

            List<String> list = new ArrayList<>(Arrays.asList(strings));
            for(int i = 0; i < answer.length; i++) {
                for(int j = 0; j < list.size(); j++) {
                    if(list.get(j).substring(n, n+1).equals(answer[i])) {
                        answer[i] = list.get(j);
                        list.remove(list.get(j));
                        break;
                    }
                }
            }
            return answer;
        }

    public static void main(String[] args) {
        programmers12915 t1 = new programmers12915();
        String[] strings = new String[]{"sun", "bed", "car"};
        System.out.println(t1.solution(strings, 1));

    }
}
