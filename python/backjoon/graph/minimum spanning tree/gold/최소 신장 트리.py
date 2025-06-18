# 1197

import sys
from queue import PriorityQueue
sys.setrecursionlimit(10**6)

input = sys.stdin.readline
pq= PriorityQueue()

n,m = map(int, input().split())

parent = [0] * (n+1)

for i in range(n+1):
    parent[i] = i 

for i in range(m):
    s,e,w = map(int, input().split())
    pq.put((w,s,e)) #제일 앞 순서로 정렬 되므로 가중치를 제일 앞으로 함


def find(a):
    if a == parent[a]:
        return a
    parent[a] = find(parent[a])
    return parent[a]

def union(a,b):
    a = find(a)
    b = find(b)
    if a!=b:
        parent[b] = a

useEdge = 0
result = 0

while useEdge < n-1 : # mst는 항상 n-1개의 에지를 사용함 -> 그래프 이론
    w, s, e = pq.get()
    if find(s) != find(e): # 같은 부모가 아닌 경우에만 연결
        union(s,e)
        result += w
        useEdge += 1

print(result)