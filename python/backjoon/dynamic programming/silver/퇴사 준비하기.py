# 14051

import sys
input = sys.stdin.readline

n = int(input())
time = [0] * (n+1)
cost = [0] * (n+1)
dp = [0] * (n+2)
# 각 배열에 알맞는 값 넣어주기
for i in range(1, n+1):
    t, c = map(int, input().split())
    time[i] = t
    cost[i] = c
    
# 조건 1. n+1일이 없으니 time 배열에서 n+1일 이상 초과하는 것은 사용 불가
# 조건 2. 조건1에 필터링 되지 않는 것들 중 최대의 cost를 뽑아낼 수 있는 것 찾기

for i in range(n,0,-1):
    if time[i] + i <= n+1: # time 배열의 값 + 인덱스의 합이 n값보다 작거나 같을 때
        # time 배열[i]값이 
        if cost[i] + dp[i+time[i]] > dp[i+1]:
            dp[i] = cost[i] + dp[i+time[i]] 
        else:
            dp[i] = dp[i+1]
    else:
        dp[i] = dp[i+1]

print(dp[1])