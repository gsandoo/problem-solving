# 요구사항

# 문제에서 [["...#.."] , ["..#..."]..]의 grid 2차원 리스트와 
# [[2,4,0,3] , [1,2,3,4]] 등의 commands 이차원 배열 값을 input으로 받음.

# '#' 이 있는 값은 벽이고, '.' 값만 움직일 수 있어. 그리고 [2,4,0,3]을 예시로 들면 
# 2 = R , 4 = C , 0 = D , 3 = A 이고 R,C는 좌표의 X,Y 위치 D가 0이면 12시 3시 방향, 1은 3시 6시, 2는 6시 9시, 3은 9시 12 방향으로 움직일 수 있어.
# 그리고 A는 R, C 위치에서 최대 A번 움직일 수 있음

# 움직이면서 commands 갯수 마다 1 -> 2 -> 3 순으로 2차원 리스트에 숫자 색칠해라.

from collections import deque

def solutions(grid, commands):
    n = len(grid)
    m = len(grid[0][0])
    answer = [[0] * m for _ in range(n)]
    
    q = deque()
    
    directions = [
        [(-1,0),(0,1)],
        [(0,1),(1,0)],
        [(1,0),(0,-1)],
        [(0,-1),(-1,0)]
    ]
    
    
    for idx, (r,c,d,a) in enumerate(commands):
        # 1 indexed -> 0 indexed 
        r -= 1 
        c -= 1 
        
        visited = [[False] * m for _ in range(n)]
        
        q.append((r,c,0))
        visited[r][c] = True
        answer[r][c] = idx+1
        
        while q:
            x, y , step = q.popleft()
            if step >= a:
                continue
            for dx, dy in directions[d]:
                nx = x + dx
                ny = y + dy
                if nx >=0 and nx < n and ny >= 0 and ny < m and visited[nx][ny] == False and grid[nx][ny] == '.':
                    visited[nx][ny] = True
                    step += 1 
                    answer[nx][ny] = idx + 1
                    q.append((nx, ny, step))
        