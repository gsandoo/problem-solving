def solution(alp, cop, problems):
    answer = 0
    
    # 모든 문제를 풀 수 있는 최소의 알고력, 코딩력 구하기
    goalAlp = 0
    goalCop = 0
    for problem in problems: 
        goalAlp = max(goalAlp, problem[0])
        goalCop = max(goalCop, problem[1])
    
    # dp 배열 선언 => 2차원
    alp = min(alp, goalAlp)
    cop = min(cop, goalCop)
    
    MAX_ALP = goalAlp + 1 
    MAX_COP = goalCop + 1
    
    dp = [[float('inf')]*(MAX_COP) for _ in range(MAX_ALP)]
    dp[alp][cop] = 0
    
    # dp 상태 갱신하기 (공부 혹은 문제 풀이)
    for a in range(alp, goalAlp+1) :# 10~20
        for c in range(cop, goalCop+1):
            # 알고리즘 공부하기
            if a + 1 <= goalAlp :  
                dp[a+1][c] = min(dp[a+1][c], dp[a][c]+1) # dp[11][10]에 1 추가
            # 코딩 공부하기
            if c + 1 <= goalCop :  
                dp[a][c+1] = min(dp[a][c+1], dp[a][c]+1) # dp[10][11]에 1 추가
                
            for req_alp, req_cop, rwd_alp, rwd_cop, cost in problems:
                if a >= req_alp and c >= req_cop:
                    newAlp = min(goalAlp, a+rwd_alp)
                    newCop = min(goalCop, c+rwd_cop)
                    dp[newAlp][newCop] = min(dp[newAlp][newCop], dp[a][c] + cost)
    # print(dp[goalAlp][goalCop])
    answer = dp[goalAlp][goalCop]
    return answer

print(solution(10,10,	[[10,15,2,1,2],[20,20,3,3,4]]))