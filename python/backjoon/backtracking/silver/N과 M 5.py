# 15654
import sys
input = sys.stdin.readline

N, M = map(int, input().split())
visited = [False] * (N+1) # 불변형 타입 객체는 얕은 복사를 해도 괜찮음.
a = list(map(int, input().split()))
result = []
a.sort() # 오름차순 정렬

def DFS(level):
    if level == M:
        print(*result)
        return
    else:
       for i in range(N):
           if not visited[i]:
               visited[i] = True
               result.append(a[i])
               DFS(level + 1)
               result.pop()
               visited[i] = False 

DFS(0)