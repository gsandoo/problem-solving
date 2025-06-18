package section1;
import java.util.Scanner;

// 문장 내 가장 긴 단어 출력
public class q3 {

    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE , pos; // 가장 작은 수로 선언
        while ((pos = str.indexOf(' '))!= -1){
            String words = str.substring(0, pos);
            int length = words.length();
            if (length > m){
                answer  = words;
                m = length;
            }
            str = str.substring(pos+1);
        }
        if (str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        q3 T = new q3();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // 한줄 전부다 읽어버림
        System.out.println(T.solution(s));

    }
}
