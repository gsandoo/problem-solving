package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 종이의개수 {

    static int [][]square ;
    static int []answer ;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine()); //종이의 크기
        answer = new int[3]; // 0 은 -1의 개수 / 1은 0의 개수/ 2는 1의 개수

        square = new int[N][N];

        for(int i = 0 ; i < N ; i++){ //2차원 배열에 입력값 넣기
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0 ; j < N; j++){
                square[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        division(0,0,N);
        System.out.println(answer[0]); // -1
        System.out.println(answer[1]); // 0
        System.out.println(answer[2]); // 1

    }


    public static void division(int x , int y , int N){

        if (check(x,y,N)){ //영역이 다 같은 수 인지 체크한다.
            answer[square[x][y]+1]++;
            return;
        }


        int size = N/3;

        division(x,y,size); //1
        division(x,y+size,size);//2
        division(x,y+size*2,size);//3

        division(x+size,y,size);//4
        division(x+size,y+size,size);//5
        division(x+size,y+size*2,size);//6

        division(x+size*2,y,size);  // 7
        division(x+size*2,y+size,size); //8
        division(x+size*2,y+size*2,size); //9

    }
    public static boolean check (int x, int y ,int N){

        int firstBlock = square[x][y];

        for(int i = x; i <x+N; i++){
            for (int j = y; j <y+N ; j++){
                if(firstBlock!=square[i][j]){
                    return false;
                }
            }
        }

        return true;

    }

}