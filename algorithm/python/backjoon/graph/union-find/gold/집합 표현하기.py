# 1717

import sys
input = sys.stdin.readline
sys.setrecursionlimit(10000)

n, m = map(int, input().split())
parent = [0] *(n+1)

for i in range(n+1) :
    parent[i] = i
    
def find(a):
    if a == parent[a]:
        return a
    else :
        a = find(parent[a])
        return a

def union(a, b):
    a = find(a)
    b = find(b)
    if a != b:
        parent[b] = a

def checkSame(a,b): # 부모 노드랑 자식 노드가 연결되어있는지 확인
    a = find(a)
    b = find(b)
    if a == b:
        return True
    else:
        return False

for i in range(m):
    q, a, b = map(int, input().split())
    if q == 0:
        union(a, b)
    else: 
        if checkSame(a,b):
            print("YES")
        else :
            print("NO")

