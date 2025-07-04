# 15661
import sys
input = sys.stdin.readline

N, M = map(int, input().split())
result = []

def DFS(level):
    if level == M:
       print(*result)
       return
    else:
        for i in range(1, N+1):
            result.append(i)
            DFS(level + 1)
            result.pop()

DFS(0)