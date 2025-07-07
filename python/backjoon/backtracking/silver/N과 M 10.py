# 15664
import sys
input = sys.stdin.readline

n, m = map(int, input().split())

arr = [0] + list(map(int, input().split()))
arr.sort()

visited = [False] * (n+1)

result = []

def DFS(level, start):
    if level == m:
        print(*result)
    else:
        prev = -1
        for i in range(start, n+1):
            if not visited[i] and arr[i] != prev:
                visited[i] = True
                prev = arr[i] # 1
                result.append(arr[i]) # 1
                DFS(level+1, i+1)
                result.pop()
                visited[i] = False

DFS(0, 1)