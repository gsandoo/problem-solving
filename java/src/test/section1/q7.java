package section1;
import java.util.Scanner;

// 회문 문자열
public class q7 {
    public String solution(String str){
        String answer = "" ;
        String sb = str.toUpperCase();
        int lt = 0 , rt = str.length()-1;
        while (lt  < rt){
            if (sb.charAt(lt) != sb.charAt(rt)){
                answer = "NO";
                return  answer;
            }else {
                lt++;
                rt --;
            }
        }
        answer = "YES";
        return  answer;
    }

    public static void main(String[] args) {
        q7 T = new q7();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}

