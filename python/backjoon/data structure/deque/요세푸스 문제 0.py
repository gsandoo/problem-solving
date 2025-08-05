# https://www.acmicpc.net/problem/11866

import sys 
input = sys.stdin.readline 
from collections import deque
n, m = map(int,input().split())

dq = deque(x for x in range(1,n+1))

res = []
res.append('<')
while dq:
    for _ in range(m-1):
        dq.append(dq.popleft())
    res.append(str(dq.popleft()))
    if dq:
        res.append(', ')
res.append('>')

for s in res : 
    print(s, end = '')

