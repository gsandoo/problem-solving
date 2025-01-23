package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int[] arr = new int[9];

        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = (Integer.parseInt(br.readLine()));
        }

        int idx=1;
        int prime = arr[0];
        for (int i = 1 ; i < arr.length; i++){
            if (arr[i] > prime) {
                prime = arr[i];
                idx = i+1;
            }
        }

        System.out.println(prime);
        System.out.println(idx);
    }
}
