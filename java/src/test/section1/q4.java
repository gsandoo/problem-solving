package section1;
import java.util.ArrayList;
import java.util.Scanner;

// 단어 뒤집기
public class q4 {
    public ArrayList<String> solution(String[] str){
        ArrayList<String> answer = new ArrayList<>() ;
        for (String x: str
             ) {
            String w = new StringBuilder(x).reverse().toString();
            answer.add(w);
        }
        return  answer;
    }

    public static void main(String[] args) {
        q4 T = new q4();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [] str = new String[n];
        for (int i = 0 ; i < n ; i ++){
            str[i] = scanner.next();
        }
        for (String x: T.solution(str)
             ) {
            System.out.println(x);
        }
        }
    }

