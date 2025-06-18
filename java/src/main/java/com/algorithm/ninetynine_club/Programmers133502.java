package com.algorithm.ninetynine_club;

import java.util.Stack;

public class Programmers133502 {
    // 햄버거 만들기

    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> set = new Stack<>();

        for (int i = 0; i < ingredient.length; i++) {
            set.push(ingredient[i]);
            if (set.size() >= 4) {
                if ((set.get(set.size() - 4)) == 1
                        && (set.get(set.size() - 3)) == 2
                        && (set.get(set.size() - 2)) == 3
                        && (set.get(set.size() - 1)) == 1
                ) {
                    answer++;
                    set.pop();
                    set.pop();
                    set.pop();
                    set.pop();
                }
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        Programmers133502 programmers133502  = new Programmers133502();

        int[] ingredient = new int[9];
        ingredient[0] = 2;
        ingredient[1] = 1;
        ingredient[2] = 1;
        ingredient[3] = 2;
        ingredient[4] = 3;
        ingredient[5] = 1;
        ingredient[6] = 2;
        ingredient[7] = 3;
        ingredient[8] = 1;

        System.out.println(programmers133502.solution(ingredient));
    }
}
