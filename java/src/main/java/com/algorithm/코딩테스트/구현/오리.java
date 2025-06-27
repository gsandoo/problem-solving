package com.algorithm.코딩테스트.구현;

import java.io.*;
import java.util.*;

public class 오리 {
    static final String QUACK = "quack";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();

        List<Integer> ducks = new ArrayList<>();  // 각 오리의 진행 상태 (0~4)
        int maxDucks = 0;

        for (char ch : input) {
            int idx = QUACK.indexOf(ch);  // 현재 문자의 위치 (0~4)

            boolean assigned = false;
            // 기존 오리들 중 이 상태로 진입 가능한 오리 찾기
            for (int i = 0; i < ducks.size(); i++) {
                if (ducks.get(i) == idx - 1) {
                    ducks.set(i, idx);  // 오리 상태 전이
                    assigned = true;
                    break;
                }
            }

            // 새 오리가 울기 시작하는 경우
            if (idx == 0 && !assigned) {
                ducks.add(0);
                assigned = true;
            }

            if (!assigned) {
                // 올바른 상태 전이가 불가능하면 잘못된 입력
                System.out.println(-1);
                return;
            }

            // "k"에 도달한 오리는 울음을 마쳤으므로 제거
            ducks.removeIf(state -> state == 4);

            maxDucks = Math.max(maxDucks, ducks.size());
        }

        // 모든 오리가 울음을 정확히 마쳤는지 확인
        if (!ducks.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(maxDucks);
        }
    }
}
