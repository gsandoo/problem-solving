# 11659
import sys

input = sys.stdin.readline
N, M  = map(int, input().split())
numbers = list(map(int, input().split()))

sum = [0] # 배열 선언하고 첫 번째 값으로 0 넣음
tmp = 0

# 합 배열 만들기(s[i] = s[i-1] + a[i])
for i in numbers:
    tmp += i
    sum.append(tmp) # append : 배열 맨 마지막에 값 넣음
    
for i in range(M):
    s, e = map(int, input().split())
    #  구간 합 구하기 (s[j] - s[i-1])
    print(sum[e] - sum[s-1])
