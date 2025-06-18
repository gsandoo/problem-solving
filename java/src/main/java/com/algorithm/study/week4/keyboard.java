package com.algorithm.study.week4;
import java.util.HashMap;

// hashmap 특징 :
// 1. key, value 값으로 구성되어 있다.
// 2. get, put, contains, getordefault 등의 메서드가 존재
// 3. 본 문제에서는 hashmap과 Math.min 을 사용해 값을 집어넣는다.
public class keyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int [] answer = new int[targets.length]; // target이 2개면 answer 도 2개
        HashMap<Character, Integer> keypad = new HashMap<>();
        for (int i = 0 ; i < keymap.length ; i++){
            for (int j = 0 ; j < keymap[i].length(); j++){
                if (keypad.containsKey(keymap[i].charAt(j))){
                    int idx = keypad.get(keymap[i].charAt(j));
                    keypad.put(keymap[i].charAt(j),Math.min(idx,j+1));
                }else{
                    keypad.put(keymap[i].charAt(j),j+1);
                }
            }
        }

        for (int i = 0 ; i < targets.length ; i++){
            int count = 0;
            boolean flag  = true;
            for (int j  = 0 ; j < targets[i].length(); j++){
                if (keypad.containsKey(targets[i].charAt(j))){
                    flag = true;
                    count+= keypad.get(targets[i].charAt(j));
                }else {
                    flag = false;
                    break;
                }
            }
            answer[i] = (flag) ? count : -1;
            count = 0;
        }
        return  answer;
    }
    public static void main(String[] args) {
        keyboard T = new keyboard();

        String[] keymap = {"BC"};
        String[] targets = {"AC","BC"};
        System.out.println(T.solution(keymap, targets));
    }
}
