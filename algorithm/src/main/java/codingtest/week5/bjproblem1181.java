package codingtest.week5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bjproblem1181 {
    public String[] solution(int m , String[] str) {
        String[] answer = new String[m];


        return  answer;
    };

    public static void main(String[] args) {
        bjproblem1181 T = new bjproblem1181();
        Scanner kb = new Scanner(System.in);
        int m  = 13;
        String[] str = new String[] {
                "but",
                "i"
                ,"wont"
                ,"hesitate"
                ,"no"
                ,"more"
                ,"no"
                ,"more"
                ,"it"
                ,"cannot"
                ,"wait"
                ,"im"
                ,"yours"} ;
        for (String x: T.solution(m , str)
             ) {
            System.out.println(x);
        }
    }
}
