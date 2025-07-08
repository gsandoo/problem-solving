# 15665
import sys
input = sys.stdin.readline

n, m = map(int, input().split())

arr = [0] + list(map(int, input().split()))
arr.sort()

visited = [False] * (n+1)
result = []
def DFS(level):
    if level == m:
        print(*result)
        return
    else:
        prev = -1
        for i in range(1, n+1):
            if not visited[i] and arr[i] != prev:
                result.append(arr[i])
                prev = arr[i]
                DFS(level+1)
                result.pop()

DFS(0)