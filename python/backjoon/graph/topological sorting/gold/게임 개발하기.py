from collections import deque

n = int(input())
a = [[] for _ in range (n + 1)]
indegree = [0] * (n+1) # 진입 차수 리스트
selfbuild = [0] * (n+1) # 건물 생산 시간 리스트

for i in range(1, n+1):
    inputList = list(map(int, input().split())) # 10 1 -1
    selfbuild[i] = (inputList[0]) # 10
    idx = 1
    while True:
        preTmp = inputList[idx]
        idx +=1
        if preTmp == -1:
            break
        a[preTmp].append(i)
        indegree[i] += 1

queue = deque()

for i in range(1, n+1):
    if indegree[i] == 0:
        queue.append(i)

result = [0] * (n+1)

while queue:
    now = queue.popleft()
    for next in a[now]:
        indegree[next] -= 1
        result[next] = max(result[next], result[now]+ selfbuild[now])
        if indegree[next] == 0:
            queue.append(next)

for i in range(1 , n+1):
    print(result[i] + selfbuild[i])