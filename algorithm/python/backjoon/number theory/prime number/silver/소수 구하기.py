# 1929
import math
import sys 
input = sys.stdin.readline

n,m = map(int, input().split())
a = list(x for x in range(1, m+1))

for i in range(2, math.sqrt(m)+1): # 2 ~ 16 제곱근 까지만
    if a[i] == 0:
        continue
    for j in range (i+i, m+1, i) : # 4 ~ 16 까지, +2씩 증가
        a[j] = 0

for i in range(n, m+1) :
    if a[i] != 0:
        print(a[i])

