# 15650

import sys
input = sys.stdin.readline

n, m = map(int, input().split()) # 입력
result = []

def DFS (level, start):
    if level == m:
        print(*result)
        return
    else:
        for i in range(start, n+1): # 여기서 이미 시작점이 start라 중복 탐색 x => visited 배열 필요없음
            result.append(i)
            DFS(level+1, i + 1)
            result.pop()

DFS(0,1)