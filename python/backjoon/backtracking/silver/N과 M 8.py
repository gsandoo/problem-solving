#15667
# 15655
import sys
input = sys.stdin.readline

n, m = map(int, input().split())

arr = list(map(int, input().split()))

arr.sort() # 오름차순 정렬

result = []

def DFS (level, start, arr):
    if level == m:
        print(*result)
        return 
    else:
        for i in range(start, n): 
            result.append(arr[i]) 
            DFS(level+1, i, arr)
            result.pop()
DFS(0, 0, arr)