# 1916

import sys
input = sys.stdin.readline
from queue import PriorityQueue

n = int(input())
bus = int(input())

visited = [False] * (n+1)
a = [[] for _ in range(n+1)]
dist = [sys.maxsize] * (n+1)
q = PriorityQueue()

# 인접리스트에 저장
for i in range(bus):
    u, v, w = map(int, input().split()) # 이전 노드, 이동할 노드, 가중치
    a[u].append((v, w))

start, end = map(int, input().split())

q.put((0, start)) # 가중치 , 시작 노드
dist[start] = 0

while q.qsize() > 0:
    current = q.get()
    curr_v = current[1]
    if visited[curr_v]:
        continue
    visited[curr_v] = True
    # 방문한 노드의 인접 리스트 요소 꺼내기
    for tmp in a[curr_v]:
        nxt = tmp[0] # 이동할 노드
        wgt = tmp[1] # 가중치
        if dist[nxt] > dist[curr_v] + wgt:
            dist[nxt] = dist[curr_v] + wgt
        q.put((dist[nxt], nxt)) # 가중치, 다음 노드

if(visited[end]):
    print(dist[end])

        
