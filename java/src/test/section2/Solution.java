package section2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] dice = {
                {1, 2, 3, 4, 5, 6},
                {3, 3, 3, 3, 4, 4},
                {1, 3, 3, 4, 4, 4},
                {1, 1, 4, 4, 5, 5}
        };

        int[] result = solution(dice);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[][] dice) {
            int n = dice.length;
            int halfN = n / 2;
            int[] answer = new int[halfN];

            int maxWinCount = 0;
            int[] selectedDice = new int[halfN];

            for (int i = 0; i < (1 << n); i++) {
                if (Integer.bitCount(i) == halfN) {
                    int[] A = new int[halfN];
                    int[] B = new int[halfN];
                    int AIndex = 0;
                    int BIndex = 0;

                    for (int j = 0; j < n; j++) {
                        if ((i & (1 << j)) == 0) {
                            A[AIndex++] = j + 1;
                        } else {
                            B[BIndex++] = j + 1;
                        }
                    }

                    int winCount = countWinningCases(dice, A, B);
                    if (winCount > maxWinCount) {
                        maxWinCount = winCount;
                        selectedDice = Arrays.copyOf(A, halfN);
                    }
                }
            }

            return selectedDice;
        }

        public static int countWinningCases(int[][] dice, int[] A, int[] B) {
            int winCount = 0;

            for (int a : A) {
                for (int b : B) {
                    int scoreA = rollDice(dice[a - 1]);
                    int scoreB = rollDice(dice[b - 1]);

                    if (scoreA > scoreB) {
                        winCount++;
                    }
                }
            }

            return winCount;
        }

        public static int rollDice(int[] dice) {
            int sum = 0;
            for (int value : dice) {
                sum += value;
            }
            return sum;
        }
}


