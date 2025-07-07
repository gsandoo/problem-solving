# 15656
import sys
input = sys.stdin.readline

n, m = map(int, input().split())

arr = list(map(int, input().split()))

arr.sort() # 오름차순 정렬

result = []

def DFS (level, arr):
    if level == m:# 1 2
        print(*result)
        return 
    else:
        for i in arr:
            result.append(i) 
            DFS(level+1, arr)  
            result.pop()

DFS(0, arr)