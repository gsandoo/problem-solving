from collections import deque

dx, dy  = [-1,0,1,0], [0,1,0,-1] 
def bfs(x,y,n, visited,arr):
	dq = deque()
	dq.append((x,y))
	while dq : 
		cx, cy = dq.popleft()
		for i in range(4):
			nx = x + dx[i]
			ny = y + dy[i]
			if (0 <= nx < n and 0 <= ny < n) and visited[nx][ny]==0 and arr[nx][ny] != 1:
				visited[nx][ny] = visited[cx][cy] + 1
				dq.append((nx,ny))
				
def solution(n, garden):
	answer = 0
	visited = [[0]*n for _ in range(n)]
	for i in range(n):
		for j in range(n):
			if garden[i][j] == 1 and visited[i][j]!=1: 
				visited[i][j] = 1
				bfs(i,j,n, visited, garden)
			
	for i in range(n):
		for j in range(n):
			answer = max(answer, visited[i][j])

	if answer == 1 :
		answer = 0
	return answer 