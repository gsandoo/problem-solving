def solution(pos):
	answer = 0
	dx, dy = [1,2,2,1,-1,-2,-2,-1] , [-2,-1,1,2,2,1,-1,-2] # 체스 말 이동경로
	x,y = ord(str(pos[0]))-65, 8-int(pos[1])
	for i in range(8):
		nx, ny = x + dx[i], y + dy[i] # [1,-1],[0,2],[2,2],[3,1],[3,-1],[2,-2],[0,-2],[-1,-1]
		if (0 <= nx < 8 and 0 <= ny < 8) : 
			answer +=1
	return answer