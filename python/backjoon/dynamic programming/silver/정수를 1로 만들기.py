# 1463

import sys
input = sys.stdin.readline
n = int(input())

dp = [0] * (n+1)

for i in range(2, n+1):
    dp[i] = dp[i-1] + 1 # -1 연산
    if i %  2 == 0 : # 나누기 2 연산
        dp[i] = min(dp[i], dp[i//2] + 1)
    if i %  3 == 0 : # 나누기 3 연산
        dp[i] = min(dp[i], dp[i//3] + 1)

print(dp[n])
