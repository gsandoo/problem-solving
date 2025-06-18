package section1;

import java.util.*;

// section1.1 문자 찾기
class q1 {
    public int solution(String str, char c) {
        int answer = 0;
        String sb = str.toUpperCase();
        char cb = Character.toUpperCase(c);

        // 1. 일반적인 for 문
//        for(int i = 0 ; i  <sb.length(); i++){
//            if (sb.charAt(i) == cb) answer++;
//        }

        // 2. 향상된 for문 forEach 사용
        for (char x: sb.toCharArray()
             ) {
            if (x == cb) answer++;
        }
        return  answer;
    }

    public static void main(String[] args) {
        q1 T = new q1();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);


        System.out.println(T.solution(str, c));
    }
}