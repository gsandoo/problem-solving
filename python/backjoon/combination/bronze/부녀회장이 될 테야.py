# 2775

import sys 
input = sys.stdin.readline

t = int(input())

dp= [[0 for i in range(15)] for j in range(15)] # 범위 1~14


# 0층 주민 + i층 0호 + i층 1호
for i in range(1, 15):
    dp[0][i] = i
    dp[i][0] = 0
    dp[i][1] = 1

# 1층 주민 ~ 14층 주민     
for k in range(1, 15):
    for j in range(2, 15):
        dp[k][j] = dp[k-1][j] + dp[k][j-1]

for i in range(t):
    n = int(input()) # 층
    k = int(input()) # 호
    print(dp[n][k])
    