package com.algorithm.study.week6;

//2개이하로 다른 비트
public class Programmers77885 {
    // 규칙은 n이 짝수일 땐 n+1의 값을 append
    // n이 짝수가 아닐 시, n을 2진수로 변환한 값 안에 01이 있는지 확인
    // 01 이 있으면 10으로 바꿔주고, 01이 없다면 최상위 비트를 지우고 10을 삽입
    // ex) 7를 2진수로 변환시 -> 0111 이 아닌 111로 된다.
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int idx = 0 ;
        for (long x : numbers){
            if (x %2 ==0) answer[idx] = x+1; // 짝수면 n+1
            else{
                StringBuilder binary = new StringBuilder(Long.toBinaryString(x)); //먼저 2진수 string 으로 변환
                int len = binary.length(); // 길이 확인
                if (binary.toString().contains("01")){ // 01이 있는지 확인
                    for (int i = len; i > 0; i--) {
                        if (binary.substring(i - 2, i).equals("01")) { //01의 위치를 찾는다
                            binary.setCharAt(i - 1, '0'); // 01 -> 10 으로 바꾼다.
                            binary.setCharAt(i - 2, '1');
                            break;
                        }
                    }
                }else{
                    binary.deleteCharAt(0); // 01이 없다면 최상위 비트를 지운다. ex)111 -> 11
                    binary.insert(0,"10"); // 맨 앞에 10을 넣는다. ex) 1011
                }
                answer[idx] = Long.valueOf(binary.toString(),2); // 이진수를 다시 10진수로 바꾼다. ex) 7 --> 1011-> 11
            }
            idx +=1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Programmers77885 t = new Programmers77885();
        long[] num = { 2,9 };
        System.out.println(t.solution(num));
    }
}
