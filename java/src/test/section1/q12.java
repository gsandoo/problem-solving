package section1;
import java.util.Scanner;

// 암호
public class q12 {
    public String solution(int n , String s){
        String answer = " ";
        for (int i = 0 ; i  < n ; i ++){
            String tmp = s.substring(0,7).replace('#' , '1').replace('*','0');
            int num = Integer.parseInt(tmp,2);
            answer += (char) num;
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        q12 T = new q12();
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        String s = scanner.next();
        System.out.println(T.solution(n,s));
    }
}

