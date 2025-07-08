# 15666
import sys
input = sys.stdin.readline

n, m = map(int, input().split())

arr = [0] + list(map(int, input().split()))
arr.sort()

visited = [False] * (n+1)
result = []

dset = set()

def DFS(level, start):
    if level == m:
        t = tuple(result)
        if t not in dset:
            print(*result)
            dset.add(t)
            return
    else:
        for i in range(start, n+1):    
            result.append(arr[i])
            DFS(level+1, i)
            result.pop() # back - tracking

DFS(0,1)
