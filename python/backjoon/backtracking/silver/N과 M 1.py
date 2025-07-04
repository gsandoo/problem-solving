# 15649

import sys
input = sys.stdin.readline

N, M = map(int, input().split())

result = []
visited = [False for _ in range(N+1)]

def DFS(curr):
    if curr == M:
        print(* result)
        return
    for i in range(1, N+1): # 출력하는 범위
        if not visited[i]:
            visited[i] = True
            result.append(i)
            DFS(curr + 1 )
            result.pop() # 출력이 끝났으면 맨 마지막 숫자 pop
            visited[i] = False # 백트래킹


DFS(0)
