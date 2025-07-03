# 2206

import sys
from collections import deque


dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

input = sys.stdin.readline
n,m = map(int, input().split())
a = [list(map(int, input().strip())) for _ in range(n)] # 2차 배열

dist = [[[0] * 2 for _ in range(m)] for _ in range(n)] # 3차원 배열
visited = [[[False] * 2 for _ in range(m)] for _ in range(n)] # 3차원 배열
# bfs 함수 
# 조건: 
# 1. 벽(1) 1번 뚫을 수 있다. 
# 2. 최단 경로 찾아라.
def BFS(x,y):
    q = deque()
    q.append((x,y,0)) # x, y, 벽 부순 여부
    visited[x][y][0] = True # 0은 벽 안 부순 것.
    dist[x][y][0] = 1
    
    while len(q) > 0 :
        x, y, broken = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if x == n - 1 and y == m - 1:
                return dist[x][y][broken]
            if nx >= 0 and nx < n and ny >= 0 and ny < m :
                # 빈 공간일 경우
                if a[nx][ny] == 0 and not visited[nx][ny][broken]:
                    visited[nx][ny][broken] = True
                    dist[nx][ny][broken] = dist[x][y][broken] + 1
                    q.append((nx, ny, broken))
                # 벽이고, 아직 안 부쉈을 경우
                elif a[nx][ny] == 1 and broken == 0 and not visited[nx][ny][1]:
                    visited[nx][ny][1] = True
                    dist[nx][ny][1] = dist[x][y][0] + 1
                    q.append((nx, ny, 1))
                               
    return -1                

answer = BFS(0,0) # 1,1 시작. 0-indexed

print(answer)    