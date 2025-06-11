# 11003
import sys 
from collections import deque

input = sys.stdin.readline
dq = deque ()

N, L  = map(int, input().split())
a = list (map (int , input().split()))  # 1 5 2 3 6 2 3 7 3 5 2 6

for i in range(N) :
    while dq and dq[-1][0] > a[i] : # dq[-1][0] 가장 최근에 삽입된 값 > 새로 들어올 값
        dq.pop ()
    dq.append ((a[i],i))
    if dq[0][1] <= i - L: # 슬라이딩 윈도우의 범위에서 벗어난 맨 앞의 인덱스의 요소를 제거해.
        dq.popleft()
    print (dq[0][0], end = ' ')

