package section1;

import java.util.Scanner;

// 문자 대소문자 바꿔 출력하기
public class q2 {

    public String solution(String str){
        String answer = "";
//        for (char x: str.toCharArray()
//             ) {
//            if (Character.isLowerCase(x))answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);
//        }

        for (char x: str.toCharArray()
             ) {
            if (x >= 65 && x <= 90) answer += (char)(x + 32);
            else answer += (char)(x - 32);
        }
        return answer;
    }

    public static void main(String[] args) {
        q2 T = new q2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}
