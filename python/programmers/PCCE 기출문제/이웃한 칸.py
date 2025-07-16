# https://school.programmers.co.kr/learn/courses/30/lessons/250125

def solution(board, h, w):
    dx = [-1,0,1,0]
    dy = [0,1,0,-1]
    answer = 0
    n, m = len(board), len(board[0]) # 4x4
    visited = [[False for i in range (m)] for j in range(n)]    
    visited[h][w] = True    
    color = board[h][w]
    
    for i in range(4):
        nx = h + dx[i]
        ny = w + dy[i]
        if 0 <= nx < n and 0 <= ny < m and not visited[nx][ny]:
            if color == board[nx][ny]:
                answer += 1
                visited[nx][ny] = True
    return answer