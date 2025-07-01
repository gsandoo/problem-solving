# 5212
from collections import deque 
import sys
import copy
input = sys.stdin.readline

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

# '#' 기준 4방향 중 3방향이 '.' 이면 50년 후 침수 됨
def check(x, y):
    q = deque()
    q.append((x,y))
    while q:
        nxt = q.popleft()
        count = 0
        for i in range(4):
            nx = nxt[0] + dx[i]
            ny = nxt[1] + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= m or grid[nx][ny] == '.':
                count += 1
        if count >= 3:
            new_grid[nxt[0]][nxt[1]] = '.'

def minigrid():
    min_row, max_row = n, 0
    min_col, max_col = m, 0

    for i in range(n):
        for j in range(m):
            if new_grid[i][j] == 'X':
                min_row = min(min_row, i)
                max_row = max(max_row, i)
                min_col = min(min_col, j)
                max_col = max(max_col, j)
    return min_row, max_row, min_col, max_col


n, m = map(int, input().split())
grid = []

for i in range(n):
    grid.append(list(input().strip()))

# 복사본
new_grid = copy.deepcopy(grid)

for i in range(n):
    for j in range(m):
        if grid[i][j] == 'X':
            check(i,j)

# 다 돌고 최소 격자로 만드는 함수
size = list(minigrid())

# 출력
for i in range(size[0], size[1]+1):
        print(''.join(new_grid[i][size[2]:size[3] + 1])) # ['X', 'X', '.', '.', '.', 'X'] -> 'XX...X'
    