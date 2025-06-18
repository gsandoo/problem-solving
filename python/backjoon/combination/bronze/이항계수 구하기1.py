# 11050

import sys 
input = sys.stdin.readline

n,k = map(int, input().split())

dp = [[0 for j in range(n+1)] for i in range(n+1)] # 2차원 리스트

for i in range(n+1): # 세팅
    dp[i][1] = i
    dp[i][0] = 1
    dp[i][i] = 1 

for i in range (n+1):
    for j in range(1, i):
        dp[i][j] = dp[i-1][j-1] + dp[i-1][j]

print(dp[n][k])