def solution(n):
	answer = 0
	dx, dy = [1,0,-1,0], [0,1,0,-1]
	x = y = d = 0
	a = [[0] * n for _ in range(n)]
	
	for i in range(1, n*n+1):
		a[y][x] = i
		nx,ny = x + dx[d] , y + dy[d]
		if not ( 0 <= nx < n and 0 <= ny < n ) or a[ny][nx] != 0 :
			d = (d+1)%4
			nx,ny = x + dx[d] , y + dy[d]
		x,y = nx, ny
	answer = sum(a[i][i] for i in range(n))
	return answer