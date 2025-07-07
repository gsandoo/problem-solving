# 15652

import sys
input = sys.stdin.readline

n, m = map(int, input().split())

result = []

def DFS (level,curr):
    if level == m:# 1 2
        print(*result)
        return 
    else:
        for i in range(curr, n+1):
            result.append(i)
            DFS(level+1, i)
            result.pop()

DFS(0,1)
