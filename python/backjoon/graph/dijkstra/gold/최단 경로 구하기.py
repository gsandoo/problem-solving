# 1753

import sys
input = sys.stdin.readline
from queue import PriorityQueue

V, E  = map(int, input().split()) # V,E
start = int(input()) # 시작점

dist = [sys.maxsize] * (V+1) # 거리 리스트
a = [[] for _ in range(V+1)] # 인접리스트
visited = [False] * (V+1) # 재방문 방지 리스트
q = PriorityQueue() # 우선순위 큐


# 인접리스트에 데이터 삽입
for i in range(E):
    u, v, w = map(int, input().split()) # u에서 v로 가는 가중치 w
    a[u].append((v,w))

q.put((0, start)) # 시작점 큐에 넣기
dist[start] = 0 # 시작 노드는 거리가 0, 여기서 시작하니까

while q.qsize() > 0 :
    curr = q.get()
    c_v = curr[1]
    if visited[c_v]:
        continue
    visited[c_v] = True
    for tmp in a[c_v]: # 인접 리스트에서 꺼내는 노드들
        nxt = tmp[0] # 다음 노드
        val = tmp[1] # 가중치
        if dist[nxt] > dist[c_v] + val: # 다음 노드까지의 거리 > 시작~현재 노드까지 거리+ 현재~다음 노드까지 거리
            dist[nxt] = dist[c_v] + val
        # 정렬 기준이 가중치 이므로 순서를 가중치, 목표 노드 순으로 우선순위 큐 설정
        q.put((dist[nxt], nxt))

for i in range(1, V+1):
    if visited[i]:
        print(dist[i])
    else:
        print("INF")

    

    