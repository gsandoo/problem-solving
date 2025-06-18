#1854
 
import sys
input = sys.stdin.readline
from queue import PriorityQueue

n, m, k = map(int,input().split())
 
a = [[] for _ in range(n+1)] # 인접 리스트
dist = [[sys.maxsize] * k for _ in range(n+1)] # 거리 배열
pq = PriorityQueue()

for i in range(m):
    u, v, w = map(int, input().split())
    a[u].append((v, w))

pq.put((0,1)) # 가중치, 노드
dist[1][0] = 0

while pq.qsize() > 0 :
    current = pq.get() #(0,1) 가중치, 시작 노드
    current_v = current[1] # 시작 노드
    
    for tmp in a[current_v]:
        nxt_node = tmp[0] # 다음 노드
        value = tmp[1] # 가중치
        cost = current[0] + value
        
        if dist[nxt_node][k-1] > cost : 
             dist[nxt_node][k-1] = cost
             dist[nxt_node].sort()
             pq.put((cost, nxt_node))

for i in range(1, n+1):
    if dist[i][k-1] == sys.maxsize:
        print(-1)
    else:
        print(dist[i][k-1])