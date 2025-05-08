package com.algorithm.programmers.일반문제.타겟넘버;

public class Solution {

    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target, 0);
        return answer;
    }

    private void dfs(int depth, int[] numbers, int target, int sum) {
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        dfs(depth + 1, numbers, target, sum + numbers[depth]);
        dfs(depth + 1, numbers, target, sum - numbers[depth]);
    }

    public static void main(String[] args) {
        Solution t1 = new Solution();
        int[] numbers = new int[5];
        for (int i = 0 ; i < numbers.length ; i++){
            numbers[i] = 1;
        }
        System.out.println(t1.solution(numbers,3));
    }
}
