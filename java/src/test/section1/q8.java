package section1;
import java.util.Scanner;

// 회문 문자열
public class q8 {
    public String solution(String str){
        String answer = "" ;
        String sb = str.toUpperCase().replaceAll("[^A-Z]", "");
        //System.out.println(sb);
        String sbr = new StringBuilder(sb).reverse().toString();
        if (sb.equals(sbr)){
        answer = "YES";
        return  answer;
        }else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        q8 T = new q8();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}

