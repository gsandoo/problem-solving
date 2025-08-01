# https://www.acmicpc.net/problem/17626

import sys
input = sys.stdin.readline

N = int(input())
dp = [0] * (N + 1)

# 초기화
for i in range(1, N + 1):
    dp[i] = i  # 최악의 경우
    j = 1
    while j * j <= i:
        dp[i] = min(dp[i], dp[i - j * j] + 1)
        j += 1

print(dp[N])
