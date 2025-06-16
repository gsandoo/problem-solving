# 11404

import sys
input = sys.stdin.readline

n = int(input())
m = int(input())

dist = [[sys.maxsize for j in range(n+1)]for i in range(n+1)] # nxn 2차원 배열(인접 행렬) 생성

# 자기 자신 노드 거리 값 0으로 초기화 시켜주기
for i in range (1, n+1):
    dist[i][i] = 0

#입력 받은 데이터를 dist 배열에 저장하기
for i in range (m):
    s, e, v  = map(int, input().split())
    if dist[s][e] > v: # s->1, e->2, v->3이라면 => 1에서 2노드로 가는데 3이 든다.
        dist[s][e] = v

# 플로이드 워셜 수행
for k in range (1, n+1): # 경유지 k에 관해
    for i in range(1, n+1):# 출발 노드 s에 관해
        for j in range(1, n+1): # 도착 노드 e에 관해
            if dist[i][j] > dist[i][k] + dist[k][j]:
                dist[i][j] = dist[i][k] + dist[k][j]

                
for i in range(1, n+1): 
    for j in range(1, n+1):
        if dist[i][j] == sys.maxsize: 
            print(0, end = ' ')
        else:
            print(dist[i][j], end = ' ')
    
    print()

