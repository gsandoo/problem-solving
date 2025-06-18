# 11657

import sys
input = sys.stdin.readline

n,m = map(int, input().split())

edges = [] # 에지 선언
dist = [sys.maxsize] * (n+1) # 거리 배열(정답 배열) 선언, 0,1,2...n

for i in range(m): # 에지 데이터 저장
    start, end, time = map(int,input().split())
    edges.append((start, end, time))

dist[1] = 0 # inf, 0 , inf, inf, inf .. n까지

for _ in range(n-1): # 예. n =5면 비교는 4번만 하면됨. 1<>2<>3<>4<>5
    for start, end, time in edges:
        if dist[start] != sys.maxsize and dist[end] > dist[start] + time:
            dist[end] = dist[start] + time

# 음수 사이클 확인
cycle = False

for start, end, time in edges:
    if dist[start] != sys.maxsize and dist[end] > dist[start] + time:
        cycle = True

# 출력
if not cycle:
    for i in range(2, n+1):
        if dist[i] != sys.maxsize:
            print(dist[i])
        else:
            print(-1)
else:
    print(-1)

