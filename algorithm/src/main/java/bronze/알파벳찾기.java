package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳찾기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] chararr = br.readLine().toCharArray();


        boolean flag = true;
        for (int i = 97 ; i < 123 ; i++ ) {
            for (int j = 0 ; j < chararr.length; j++) {
                if (i == chararr[j]){
                    sb.append(j+" ");
                    flag = true;
                    j = chararr.length- 1;
                }
                else flag = false;
            }
            if (!flag) sb.append(-1+" ");
            flag = true;
        }

        System.out.println(sb.toString());
    }
}
