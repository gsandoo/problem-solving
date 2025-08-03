def solution(m, n, puddles):
    
    dp = [[0] * m for _ in range(n)]
    
    # 시작점 초기화
    dp[0][0] = 1
        
    p = set((y-1,x-1) for x,y in puddles)
    
    for i in range(n): #
        for j in range(m): 
            if (i,j) in p :
                dp[i][j] = 0
            else:
                if i > 0:
                    dp[i][j] += dp[i - 1][j]
                if j > 0:
                    dp[i][j] += dp[i][j - 1]
                dp[i][j] %= 1000000007
                
    return dp[n-1][m-1]