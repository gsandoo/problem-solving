# 1260

import sys
input = sys.stdin.readline

from collections import deque
 
n,m,v = map(int, input().split())
a = [[] for _ in range (n+1)]
visited = [False] * (n+1)


def DFS(s) :
    print(s , end = ' ')
    visited[s] = True
    for i in a[s]:
        if not visited[i]:
            visited[i] = True
            DFS(i)

for _ in range(m):
    s,e = map(int, input().split())
    a[s].append(e)
    a[e].append(s)

for i in range(n+1):
    a[i].sort()
    
DFS(v)

print()
visited = [False] * (n+1)


def BFS(s):
    dq = deque()
    dq.append(s)
    visited[s] = True
    while dq:
        node = dq.popleft()
        print(node , end = ' ')
        for i in a[node] :
            if not visited[i]:
                visited[i] = True
                dq.append(i)


BFS(v)

print()