#11160
import sys
input = sys.stdin.readline

N, M = map(int, input().split())

a = [[0]*(N+1)] # [[0,0,0,0,0]] N이 4개일 때
d = [[0] * (N+1) for _ in range(N+1)] # [[0,0,0,0,0] * N+1개의 배열] 

# a 2차원 배열에 값 넣기
for i in range (N): # 4번 돈다 -> 0,1,2,3
    a_row = [0] + [int(x) for x in input().split()] # 예. [0, 1, 2, 3, 4] 
    a.append(a_row) # 추가 [[0,0,0,0,0] , [0,1,2,3,4] ...] 이게 다 1,1이 좌측 최상단으로 맞추기 위함(1-indexed)

for i in range(1, N+1): # 1-indexed
    for j in range(1, N+1) : # 1-indexed
        d[i][j] = d[i-1][j] + d[i][j-1] - d[i-1][j-1] + a[i][j]

for _ in range(M):
    x1,y1,x2,y2 = map(int, input().split())
    result = d[x2][y2] - d[x1-1][y2] - d[x2][y1-1] + d[x1-1][y1-1]
    print(result)