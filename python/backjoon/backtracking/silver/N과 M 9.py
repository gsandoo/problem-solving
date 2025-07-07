# 15663
import sys
input = sys.stdin.readline

n, m = map(int, input().split())

arr = [0] + list(map(int, input().split()))
arr.sort() # 오름차순 정렬

visited = [False] * (n+1)
result = []

# 1번째 방식 : for문안에서 이전 숫자를 기억하는 변수 선언(prev)
def DFS(level):
    if level == m:
        print(*result)
        return
    
    prev = -1  # 직전 숫자 기억
    for i in range(1, n+1):
        if not visited[i] and arr[i] != prev:
            visited[i] = True
            result.append(arr[i])
            prev = arr[i]
            DFS(level + 1)
            result.pop()
            visited[i] = False
DFS(0)


# 2번째 방식 : set을 이용하여 중복 방지 
# dset = set()
# def DFS (level, arr):
#     if level == m:
#         t  = tuple(result) 
#         if t in dset:
#             return
#         else:
#             dset.add(t)
#             print(*result)
#         return 
#     else:
#         for i in range(1, n+1):
#             if not visited[i]:
#                 visited[i] = True 
#                 result.append(arr[i]) 
#                 DFS(level+1, arr)
#                 result.pop()
#                 visited[i] = False
# DFS(0,arr)
