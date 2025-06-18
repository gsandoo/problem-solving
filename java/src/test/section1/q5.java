package section1;
import java.util.Scanner;

// 단어 뒤집기
public class q5 {
    public String solution(String str){
        String answer ;
        char[] cl = str.toCharArray();
        int lt = 0 , rt = str.length()-1;
        while (lt < rt){
            if (!Character.isAlphabetic(cl[lt])){
                lt ++;
            } if (!Character.isAlphabetic(cl[rt])) {
                rt --;
            }else {
                char tmp = cl[lt];
                cl[lt] = cl[rt];
                cl[rt] = tmp;
                lt++;
                rt --;
            }
        }
        answer= String.valueOf(cl);
        return  answer;
    }

    public static void main(String[] args) {
        q5 T = new q5();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}

