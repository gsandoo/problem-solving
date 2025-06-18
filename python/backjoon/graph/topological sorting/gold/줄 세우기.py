# 2252
from collections import deque
import sys
input = sys.stdin.readline

n,m = map(int, input().split())

#인접 리스트
myList = [[] for _ in range(n+1)]

# 진입차수 배열
ind = [0] * (n+1)

for i in range(m):
    s, e = map(int,input().split())
    myList[s].append(e)
    ind[e] += 1

# deque 선언
dq = deque()

# 진입차수 리스트의 값이 0인 노드를 덱에 삽입
for i in range(1, n+1):
    if ind[i] == 0:
        dq.append(i)

# 위상 정렬 수행
while dq:
    now = dq.popleft() # fifo, pop(lifo)
    print(now , end = ' ')
    for nxt in myList[now]:#현재 노드에서 갈 수 있는 노드의 개수
        ind[nxt] -= 1
        if ind[nxt] == 0:
            dq.append(nxt)
