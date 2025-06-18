#11437
import sys
from collections import deque

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

tree = [[]for _ in range(n+1)]

for i in range (0, n-1): # 0~14
    s, e = map(int ,input().split())
    tree[s].append(e)
    tree[e].append(s)

depth = [0] * (n+1) # 노드 깊이 리스트
parent = [0] * (n+1)  # 노드 조상 리스트
visited = [False] * (n+1) # 방문 여부 저장


def bfs(x):
    q = deque()
    visited[x] = True
    q.append(x)
    
    level = 1
    now_size = 1
    cnt = 0 
    
    while q:
        tmp = q.popleft()
        for nxt in tree[tmp]:
            if not visited[nxt]:
                visited[nxt] = True
                q.append(nxt)
                parent[nxt] = tmp
                depth[nxt] = level
        cnt += 1 
        if cnt == now_size:
            cnt = 0
            level+=1
            now_size = len(q)
    
bfs(1)


def LCA(a, b):
    if depth[a] < depth[b]:
        tmp = a 
        a = b
        b = tmp
    
    while depth[a] != depth[b]:
        a = parent[a]

    while a != b:
        a = parent[a]
        b = parent[b]
    
    return a

M = int(input())

for _ in range(M):
    a , b  = map(int, input().split())
    print(str(LCA(a,b)))
    print('\n')