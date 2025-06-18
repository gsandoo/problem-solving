# 11051

import sys 
input = sys.stdin.readline

n, k = map(int, input().split())

dp= [[0 for j in range(n+1)]for i in range(n+1)] # 2차원 배열 인덱스는 0~n까지(0은 활용x)

for i in range(n+1):
    dp[i][1] = i
    dp[i][i] = 1
    dp[i][0] = 1

for i in range(n+1):
    for j in range(1, i):
        dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % 10007
        
print(dp[n][k])
