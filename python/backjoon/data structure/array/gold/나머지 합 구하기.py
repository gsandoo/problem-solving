# 10986

# 문제 핵심 : 
# 합 배열에서 두 구간 (a[j] - a[i-1]) % m == 0이면 아래 공식이 성립한다.
# a[j] % m == a[i-1] % m == 0
# 따라서 나머지의 개수가 같은 것 끼리 조합 공식을 통해 조합 개수를 알아내고 + 합배열의 원소 % m == 0인 개수 하면 답이 된다.

import sys
input = sys.stdin.readline

n, m = map(int, input().split())
a = list(map(int, input().split()))

tmp = 0
remainder_count = [0] * m
remainder_count[0] = 1  # 합이 0일 때도 하나의 경우로 세어줌

answer = 0
for i in range(n):
    tmp += a[i] 
    r = tmp % m
    answer += remainder_count[r]
    remainder_count[r] += 1

print(answer)