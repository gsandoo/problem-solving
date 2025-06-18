package section1;
import java.util.ArrayList;
import java.util.Scanner;

// 문자열 압축
public class q11 {
    public ArrayList<String> solution(String s){
        s= s+" ";
        ArrayList<String>answer = new ArrayList<>();
        int count = 1;
        for (int i = 0 ; i < s.length()-1 ; i++) {
            if (s.charAt(i) != s.charAt(i+1)){
                if (count ==1 ){
                    String c = String.valueOf(s.charAt(i));
                    answer.add(c);
                }else{
                    String c = String.valueOf(s.charAt(i));
                    String cw = String.valueOf(count);
                    answer.add(c);
                    answer.add(cw);
                    count =1;
                }
            }else {
                count ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        q11 T = new q11();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        for (String x: T.solution(s)
             ) {
            System.out.print(x);
        }
    }
}

