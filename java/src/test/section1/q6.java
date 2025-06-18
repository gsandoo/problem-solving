package section1;
import java.util.Scanner;

// 중복 문자 제거
public class q6 {
    public String solution(String str){
        String answer = "" ;
        for (int i = 0 ; i < str.length() ; i ++){
            //System.out.println(str.charAt(i)+ " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i))==i){
               answer += str.charAt(i);
            }
        }
        
        return  answer;
    }

    public static void main(String[] args) {
        q6 T = new q6();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}

