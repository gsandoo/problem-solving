# https://school.programmers.co.kr/learn/courses/30/lessons/340198

def solution(mats, park):
    m = 0
    answer = 0
    dp = [[0 for i in range(len(park[0]))] for j in range(len(park))] # 2차원 배열 생성
    # 전략: dp
    # 오른쪽 하단을 꼭지점으로 하는 최대 정사각형 크기를 가진다.
    
    for i in range(len(park)):
        for j in range(len(park[0])) :
            if park[i][j] == '-1':
                if i == 0 or j == 0 :
                    dp[i][j] = 1
                else:
                    dp[i][j] = min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + 1 # 최대 정사각형을 만드는 핵심 규칙
                m = max(m , dp [i][j])
                                

    mats.sort()
    for i in reversed(mats):
        if m >= i:
            answer = i
            return answer 
    return -1