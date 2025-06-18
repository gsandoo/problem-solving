package section1;
import java.util.Scanner;

// 숫자만 추출하기
public class q9 {
    public int solution(String str){
        String answer = "" ;
        String sb = str.replaceAll("[a-zA-Z]", "");
        for (char x: sb.toCharArray()
             ) {
            if (Character.isDigit(x)){
                answer+= x ;
            }
        }
        return  Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        q9 T = new q9();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}

