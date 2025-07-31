def solution(maps):
    from collections import deque
    from collections import defaultdict
    
    counter = defaultdict(list)
    counter['apple'].append('kim')
    print(counter['apple'])
    dx = [-1,0,1,0]
    dy = [0,1,0,-1]
    def bfs(x,y):
        q = deque()
        q.append((x,y))
        visited[x][y] = True
        while q:
            cx, cy = q.popleft()
            for i in range(4):
                nx = cx + dx[i]
                ny = cy + dy[i]
                if 0 <= nx < height and 0 <= ny < width and maps[nx][ny] == 1:
                    if not visited[nx][ny]:
                        visited[nx][ny] = True
                        maps[nx][ny] = maps[cx][cy] + 1
                        q.append((nx,ny))
        if maps[height-1][width-1] == 1:
            return -1
        return maps[height-1][width-1]
    
    width, height =  len(maps[0]),  len(maps)
    visited = [[False for j in range(width)] for i in range(height)]
    
    answer = bfs(0,0)    
        
    return answer

print